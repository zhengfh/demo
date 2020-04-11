package com.itheima.interfice;

public interface DemoInterface {
    public abstract void method1();

    public abstract void method2();

    public abstract void method3();

    public default void method4(){
        System.out.println("这是接口中的默认方法！");
    };

    public static void method5(){
        System.out.println("这是接口中默认的静态方法！");
    };
}
