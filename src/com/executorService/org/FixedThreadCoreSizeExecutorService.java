package com.executorService.org;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadCoreSizeExecutorService {

    public static void main(String args[]){
        int coreCout = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCout);
        ExecutorService executorService = Executors.newFixedThreadPool(coreCout);

        for(int i = 0;i < 100;i++ ){
            executorService.execute(new Task());
        }
        System.out.println("Thread :"+Thread.currentThread());
    }

    static class Task implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread :"+Thread.currentThread());
        }
    }
}

