package com.itheima.thread;

public class WaitingTest {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("顾客等待买包子。。。");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("顾客买完包子吃包子");
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("老板等待顾客来买包子");
                synchronized(obj){
                    System.out.println("老板售卖包子");
                    obj.notify();
                }
            }
        }.start();
    }
}
