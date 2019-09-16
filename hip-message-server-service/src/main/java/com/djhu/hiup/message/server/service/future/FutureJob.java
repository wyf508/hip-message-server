package com.djhu.hiup.message.server.service.future;

import java.util.List;
import java.util.concurrent.*;

/**
 * 异步任务
 * @author mengbin.tang
 *
 */
public class FutureJob {
	
	/**
	 * 线程池
	 */
	private ExecutorService tPool;
	
	private static final ExecutorService statictPool = Executors.newFixedThreadPool(10);
	
	/**
	 * 异步任务默认构造器，默认10个线程
	 */
	public FutureJob(){
		this(10);
	}

	/**
	 * 异步任务默认构造器
	 * @param poolSize 线程池大小
	 */
	public FutureJob(int poolSize){
		tPool = Executors.newFixedThreadPool(poolSize);
	}
	
	/**
	 * 添加future任务
	 * @param task
	 */
	public void add(@SuppressWarnings("rawtypes") FutureTask task){
		tPool.submit(task);
	}
	
	/**
	 * 添加callable任务
	 * @param callable
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void add(Callable callable){
		FutureTask task = new FutureTask(callable); 
		add(task);
	}
	
	/**
	 * 关闭连接池，等待任务执行完成
	 */
	public void shutdown(){
		tPool.shutdown();
	}
	
	/**
	 * 是否完成
	 * @return
	 */
	public boolean isFinished(){
		return tPool.isTerminated();
	}
	
	/**
	 * 是否关闭
	 * @return
	 */
	public boolean isShutdown(){
		return tPool.isShutdown();
	}
	
	/**
	 * 等待线程结束 ，默认60秒超时
	 * @throws InterruptedException
	 */
	public void awaitTermination() throws InterruptedException{
		awaitTermination(60);
	}
	
	/**
	 * 等待线程结束
	 * @param waitSend 等待超时时间
	 * @throws InterruptedException
	 */
	public void awaitTermination(long waitSend) throws InterruptedException{
		if(!isShutdown()){
			shutdown();
		}
		tPool.awaitTermination(waitSend, TimeUnit.SECONDS);
    }
	
	/**
	 * 带返回执行 默认60秒超时
	 * @param tasks
	 * @return
	 * @throws InterruptedException
	 */
	public <T> List<Future<T>> involke(List<Callable<T>> tasks) throws InterruptedException{
		return involke(tasks, 60);
	}
	
	/**
	 * 带返回执行
	 * @param tasks
	 * @param timeout 超时时间
	 * @return
	 * @throws InterruptedException
	 */
	public <T> List<Future<T>> involke(List<Callable<T>> tasks,long timeout) throws InterruptedException{
		return tPool.invokeAll(tasks, timeout, TimeUnit.SECONDS);
	}
	
	/**
	 * 立刻自行单个带返回的方法
	 * @param callable
	 * @param timeout
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 * @throws TimeoutException
	 */
	public static <T>T involke(Callable<T> callable,long timeout) throws InterruptedException, ExecutionException, TimeoutException {
		FutureTask<T> task = new FutureTask<T>(callable); 
		return task.get(timeout, TimeUnit.SECONDS);
	}
	
	/**
	 * 执行单个线程
	 * @param runnable
	 */
	public static void involke(Runnable runnable)   {
		statictPool.execute(runnable);
	}
}
