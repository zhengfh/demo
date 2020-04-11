package com.itheima.demo;

import java.util.*;

/**
 * @author pc
 */
public class TestListAndIterator {
    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("1", "a1");
        list.add(map1);
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("2", "a2");
        list.add(map2);
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("3", "a3");
        list.add(map3);
        Map<String, Object> map4 = new HashMap<String, Object>();
        map4.put("4", "a4");
        list.add(map4);

        //通过迭代器
        Iterator<Map<String, Object>> iter = list.iterator();

        while (iter.hasNext()) {
            Map<String, Object> map = iter.next();
            map.put("b", "bb");
        }
        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> m = (Map<String, Object>) list.get(i);
            list.remove(m);
        }
        System.out.println(list.toString());

    }

}
