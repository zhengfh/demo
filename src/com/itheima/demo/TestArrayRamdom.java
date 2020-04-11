package com.itheima.demo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestArrayRamdom {
    public static void main(String[] args) {
        ArrayList<Integer>  arrayList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            arrayList.add(num);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Integer in =  arrayList.get(i);
            System.out.println(in);
        }
    }
}
