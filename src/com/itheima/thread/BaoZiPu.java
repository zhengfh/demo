package com.itheima.thread;

public class BaoZiPu extends Thread {
    private BaoZi bz;
    private String name;

    public BaoZiPu(BaoZi bz, String name) {
        this.bz = bz;
        this.name = name;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            //同步
            synchronized (bz) {
                //包子存在
                if (bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有包子，造包子
                System.out.println("包子铺开始做包子");
                if (count % 2 == 0) {
                    bz.pi = "冰皮";
                    bz.xian = "五仁";
                } else {
                    bz.pi = "薄皮";
                    bz.xian = "牛肉大葱";
                }
                count++;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                System.out.println("包子做好了" + bz.pi + bz.xian);
                System.out.println("吃货来吃吧");
                //唤醒吃货线程
                bz.notify();
            }
        }

    }
}
