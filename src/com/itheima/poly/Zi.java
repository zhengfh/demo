package com.itheima.poly;

public class Zi extends Fu {
    int num = 20;

    @Override
    public void show() {
        super.show();
        System.out.println("子类方法num:" + this.num);
    }

    public void method() {
        System.out.println("这是子类方法！");
    }
}
