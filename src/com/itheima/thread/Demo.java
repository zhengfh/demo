package com.itheima.thread;

public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new ChiHuo(bz,"吃货").start();
        new BaoZiPu(bz,"包子铺").start();
    }
}
