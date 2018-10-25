/**
 * 
 */
package com.executorService.org;

/**
 * @author mandaliya
 *
 */
public class Sample01 {
	
	public static void main(String[] args) {
		for(int i = 0;i < 10;i++){
			Thread thread1 = new Thread(new Task());
			thread1.start();
		}
		
		System.out.println("Thread Name :"+Thread.currentThread());
		
	}

	static class Task implements Runnable{

		@Override
		public void run() {
			System.out.println("Thread Name :"+Thread.currentThread());
		}
		
	}
}
