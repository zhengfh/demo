package com.itheima.poly;

public class Computer {
    public void run() {
        System.out.println("笔记本运行");
    }

    //笔记本使用usb设备
    public void useUSB(USB usb) {
        if (usb != null) {
            usb.open();
            if (usb instanceof Mouse) {
                Mouse m = (Mouse) usb;
                m.click();
            } else if (usb instanceof KeyBoard) {
                KeyBoard kb = (KeyBoard) usb;
                kb.type();
            }
            usb.close();
        }
    }

    public void close() {
        System.out.println("笔记本关闭");
    }
}
