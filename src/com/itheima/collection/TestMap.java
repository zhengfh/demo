package com.itheima.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("李晨", "范冰冰");
        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        System.out.println(map);
        Collection<String> values = map.values();
        System.out.println(values);
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string+";"+map.get(string));
        }
        System.out.println("==============");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey());
        }
    }
}
