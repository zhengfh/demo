package com.itheima.string;

public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1.getClass());
        s1 += "d";
        System.out.println(s1.getClass());
        char[] ch = new char[]{'a', 'b', 'c', 'd', 'f'};
        String str = new String(ch);
        System.out.println(str);
        byte[] bytes = new byte[]{65, 97, 98};
        String s = new String(bytes);
        System.out.println(s);
        String str2 = "abc vde fer";
        String[] array = str2.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(Math.PI);
    }
}
