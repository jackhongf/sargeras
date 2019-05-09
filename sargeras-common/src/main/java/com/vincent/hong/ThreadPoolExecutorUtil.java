package com.vincent.hong;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorUtil {

    private static ExecutorService executorService;

    public static ExecutorService instance() {
        if (executorService != null) {
            return executorService;
        } else {
            synchronized (ThreadPoolExecutorUtil.class) {
                return executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                        60L, TimeUnit.SECONDS,
                        new SynchronousQueue<Runnable>());

            }
        }
    }


}
