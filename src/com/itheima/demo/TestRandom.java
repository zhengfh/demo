package com.itheima.demo;

import javax.swing.*;
import java.util.ArrayList;

/**
 * 1、导包
 * 2、创建
 * 3、使用
 *
 * @author pc
 */
public class TestRandom {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for (int i = 0; i < arrayList.size(); i++) {
            Object o =  arrayList.get(i);
            System.out.println();
        }
    }


    public static void getSum() {
        System.out.println();
    }


}
