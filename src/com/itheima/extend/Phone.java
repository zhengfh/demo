package com.itheima.extend;

public class Phone {
    public Phone() {
        System.out.println("父类构造器！");
    }

    public void call() {
        System.out.println("打電話");
    }

    public void send() {
        System.out.println("发短信");
    }

    public void show() {
        System.out.println("显示号码");
    }
}
