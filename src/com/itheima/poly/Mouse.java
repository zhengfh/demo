package com.itheima.poly;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启，红灯姗姗");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，红灯熄灭");
    }

    public void click() {
        System.out.println("鼠标单击");
    }
}
