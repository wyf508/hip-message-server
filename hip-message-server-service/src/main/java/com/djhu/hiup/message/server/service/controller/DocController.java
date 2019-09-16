package com.djhu.hiup.message.server.service.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RestController
public class DocController {

    /**
     * logger
     */
    private static final Logger logger = LoggerFactory.getLogger(DocController.class);

    /**
     * 根据文件ID获取文件
     * @return
     */
    @GetMapping(value = "/doc")
    public ResponseEntity<FileSystemResource> getDoc(String docId) {
        File docFile=null;
        try {
            String mimeType="application/xml";
            Map<String,Object> queryParamMap=new HashMap<>();

             if(docFile!=null){
                 logger.info(docFile.getAbsolutePath());
             }
            return export(docFile,mimeType);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }finally {
            docFile.delete();
        }
        return null;
    }

    /**
     * 返回文件流的方法
     * @param file
     * @param mimeType
     * @return
     */
    private ResponseEntity<FileSystemResource> export(File file,String mimeType) {
        if (file == null) {
            return null;
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", "attachment; filename=" + file.getName());
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        headers.add("Last-Modified", new Date().toString());
        headers.add("ETag", String.valueOf(System.currentTimeMillis()));

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType(mimeType))
                .body(new FileSystemResource(file));
    }

}
