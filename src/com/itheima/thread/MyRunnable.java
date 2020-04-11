package com.itheima.thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("我需要一个教练");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("教练来了：" + Thread.currentThread().getName());
            System.out.println("教我游泳，游完后，教练回到了游泳池");
            System.out.println("--------------");
        }
    }
}
