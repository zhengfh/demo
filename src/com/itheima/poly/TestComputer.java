package com.itheima.poly;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //笔记本开启
        computer.run();
        computer.useUSB(new Mouse());
        computer.useUSB(new KeyBoard());
        //笔记本关闭
        computer.close();
    }
}
