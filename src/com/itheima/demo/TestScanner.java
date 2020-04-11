package com.itheima.demo;

import java.awt.*;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a  = sc.nextInt();
        System.out.println("请输入第二数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数");
        int c = sc.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println(max);
    }
}
