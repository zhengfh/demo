package com.itheima.inner;

public class Body {

    public class Heart {//成员内部类

        //内部类的方法
        public void beat() {
            System.out.println("心脏跳动。。。");
            System.out.println("我叫：" + name);
        }
    }

    private String name;

    public void methodBody() {
        System.out.println("外部类的方法");
        new Heart().beat();
    }
}
