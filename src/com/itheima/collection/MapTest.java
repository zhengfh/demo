package com.itheima.collection;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                Integer count = map.get(c);
                map.put(c, count++);
            }
        }
        System.out.println(map);
    }
}
