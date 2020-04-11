package com.itheima.thread;

public class TestThread {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.start();
        System.out.println(myThread1.getName());
        System.out.println(MyThread.currentThread().getName());
    }
}
