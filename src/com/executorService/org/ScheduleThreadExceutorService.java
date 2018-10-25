package com.executorService.org;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScheduleThreadExceutorService {

    public static void main(String args[]){
        ExecutorService executorService = Executors.newScheduledThreadPool(1);
        for (int i = 0 ;i < 100 ;i ++){
            executorService.execute(new Tasks());
        }

    }

    static class Tasks implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread : "+Thread.currentThread());
        }
    }
}
