/**
 * 
 */
package com.executorService.org;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author mandaliya
 *
 */
public class FixedThreadExecutorService {

	public static void main(String[] args) {
		//create the pool
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		//Submit the task 
		for(int i = 0;i < 100;i++ ){
			executorService.execute(new Task(i));
		}
		System.out.println("Thread Name :"+Thread.currentThread());
		
	}
	
	
	static class Task implements Runnable{
		int i ;
		public Task(int i) {
			this.i =i;
		}
		@Override
		public void run() {
			System.out.println("Thread Name :"+Thread.currentThread()+" Task :"+i);
		}
		
	}
}
