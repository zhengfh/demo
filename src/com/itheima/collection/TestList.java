package com.itheima.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(("张三1"), 20));
        list.add(new Person(("张三2"), 30));
        list.add(new Person(("张三3"), 40));
        list.add(new Person(("张三4"), 50));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            if (person.age == 20) {
                //list.remove(i);
                person.setAge(50);
            }
            System.out.println(list.get(i));
        }
        System.out.println(list);
//        for (Person p : list) {
//            if (p.age == 30) {
//                list.remove(p);
//            }
//        }
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person person = it.next();
            if (person.age == 50) {

                person.setAge(100);
            }
        }
        System.out.println(list);
    }
}
