package com.itheima.extend;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;

/**
 * 子类构造器默认为super();
 * super关键字访问父类内容
 * this关键字用来访问本类内容
 */
public class NewPhone extends Phone {
    int num = 10;

    public NewPhone() {
        this(30);
        System.out.println("子类无参构造器！");
    }

    public NewPhone(int num) {
        System.out.println("子类有参构造器！");
        this.num = num;
        System.out.println(this.num);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("显示名称");
    }
}
