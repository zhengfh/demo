package com.itheima.poly;

/**
 * 父类引用指向子类对象，从而产生多种形态
 * 多态访问成员变量的两种方式：
 * 1、直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
 * 2、间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找
 * 3、编译看左边，运行还是看左边
 * 多态成员方法访问则是：
 * 看new的是谁，就优先用谁，没有则向上找
 * 口诀：编译看左边，运行看右边
 */
public class TestPoly {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
        obj.show();
        if (obj instanceof Zi) {

        }
    }
}
