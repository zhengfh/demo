package com.itheima.inner;

public class DemoMain {
    public static void main(String[] args) {
        MyInterface myInterFace = new MyInterFaceImpl();
        myInterFace.method();
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类方法！");
            }
        }.method();
    }
}
