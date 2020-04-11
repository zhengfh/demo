package com.itheima.thread;

import java.sql.SQLOutput;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("run:" + i);
        }
        System.out.println(new MyThread().getName()+"th");
        System.out.println(Thread.currentThread().getName());
    }

}
