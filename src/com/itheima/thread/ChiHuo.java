package com.itheima.thread;

public class ChiHuo extends Thread {
    private BaoZi bz;
    private String name;

    public ChiHuo(BaoZi bz, String name) {
        this.bz = bz;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //没包子,等待
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃" + bz.pi + bz.xian + "包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
