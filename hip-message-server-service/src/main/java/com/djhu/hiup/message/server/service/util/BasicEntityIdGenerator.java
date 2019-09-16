package com.djhu.hiup.message.server.service.util;


import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


/**
 * BasicEntityIdGenerator
 *雪花模型唯一ID生成器接口实现
 *
 */
@Service
public class BasicEntityIdGenerator {

    private final long sequenceBits = 12;
    private final long datacenterIdBits = 10L;
    private final long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);

    private final long datacenterIdShift = sequenceBits;
    private final long timestampLeftShift = sequenceBits + datacenterIdBits;

    private final long twepoch = 1288834974657L;
    private final long datacenterId;
    private final long sequenceMax = 4096;

    private volatile long lastTimestamp = -1L;
    private volatile long sequence = 0L;

    private static BasicEntityIdGenerator basicEntityIdGenerator;

    public static BasicEntityIdGenerator getInstance() throws Exception {
        if (basicEntityIdGenerator == null) {
            basicEntityIdGenerator = new BasicEntityIdGenerator();
        }
        return basicEntityIdGenerator;
    }

    private BasicEntityIdGenerator() throws Exception {
        datacenterId = getDatacenterId();
        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            //生成Id大于最大值
            throw new Exception("生成Id大于最大值");
        }
    }


    public synchronized String generateLongId() throws Exception {
        long timestamp = System.currentTimeMillis();
        if (timestamp < lastTimestamp) {
            //时钟向后移动,拒绝生成id为{0}毫秒
            throw new Exception("时钟向后移动,拒绝生成id为{0}毫秒");
        }
        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) % sequenceMax;
            if (sequence == 0) {
                timestamp = tilNextMillis(lastTimestamp);
            }
        } else {
            sequence = 0;
        }
        lastTimestamp = timestamp;
        Long id = ((timestamp - twepoch) << timestampLeftShift) |
                (datacenterId << datacenterIdShift) |
                sequence;
        return id.toString();
    }

    protected long tilNextMillis(long lastTimestamp) {
        long timestamp = System.currentTimeMillis();
        while (timestamp <= lastTimestamp) {
            timestamp = System.currentTimeMillis();
        }
        return timestamp;
    }

    protected long getDatacenterId() throws Exception{
        try {
            InetAddress ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            long id;
            if (network == null) {
                id = 1;
            } else {
                byte[] mac = network.getHardwareAddress();
                if (mac == null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyymmddhhmmssS");
                    //获取String类型的时间
                    String strDate = sdf.format(new Date());
                    mac = new String(strDate + UUID.randomUUID().toString().hashCode()).getBytes();
                }
                id = ((0x000000FF & Long.valueOf(mac[mac.length - 1])) |
                        (0x0000FF00 & ((Long.valueOf(mac[mac.length - 2])) << 8))) >> 6;
            }
            return id;
        } catch (Exception e) {
           throw e;
        }
    }


}

