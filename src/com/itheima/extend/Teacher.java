package com.itheima.extend;

public class Teacher extends Employee {
    int num = 20;
    @Override
    public void method() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
