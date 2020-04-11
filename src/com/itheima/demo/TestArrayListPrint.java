package com.itheima.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 */
public class TestArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);

            if (i == arrayList.size() - 1) {
                System.out.print(s + "}");
            } else {
                System.out.print(s + "@");
            }
        }
    }
}
