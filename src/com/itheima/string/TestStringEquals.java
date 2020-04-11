package com.itheima.string;

import java.util.Scanner;

import static java.lang.System.in;

public class TestStringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str2));
        Scanner scanner = new Scanner(in);

    }
}
