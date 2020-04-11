package com.itheima.inner;

/**
 * 内部类分类：
 * 1、成员内部类
 * 2、局部内部类(包含匿名内部类)
 * 内部类定义格式
 * 修饰符 class 外部类名称 {
 *     修饰符 class 内部类名称 {
 *         //..
 *     }
 *     //..
 * }
 * 注意：内用外，随意访问；外用内，需要内部对象
 * 如何使用成员内部类
 * 1、间接方式，在外部类的方法当中使用内部类，然后main只是调用外部类的方法
 * 2.直接方式
 * 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("==============================");
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
