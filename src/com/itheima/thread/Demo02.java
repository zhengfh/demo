package com.itheima.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(100);
        MyRunnable r = new MyRunnable();
        es.submit(r);
        es.submit(r);
        es.submit(r);
        es.submit(r);
    }
}
