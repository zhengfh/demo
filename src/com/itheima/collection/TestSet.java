package com.itheima.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        set.add(s1);
        set.add(s2);
        set.add("种地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
        System.out.println("--------------");
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("张三", 20));
        hashSet.add(new Person("张三", 20));
        hashSet.add(new Person("张三", 20));
        hashSet.add(new Person("张三", 20));
        System.out.println(hashSet);
        System.out.println("--------------");
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("李四",20));
        treeSet.add(new Person("李四",30));
        treeSet.add(new Person("李四",40));
        treeSet.add(new Person("李四",50));
        System.out.println(treeSet);
    }
}
