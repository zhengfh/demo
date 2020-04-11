package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class TestPoker {
    public static void main(String[] args) {
        //准备牌盒
        HashMap<Integer, String> pockerMap = new HashMap<>();
        //创建花色
        ArrayList<String> colors = new ArrayList<>();
        //数字集合
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int count = 1;
        pockerMap.put(count++, "大王");
        pockerMap.put(count++, "小王");
        //组牌
        for (String number : numbers) {
            for (String color : colors) {
                pockerMap.put(count++, color + number);
            }
        }
        System.out.println(pockerMap);
        Set<Integer> numberSet = pockerMap.keySet();
        //转换为List打乱顺序
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);
        ArrayList<Integer> noP1 = new ArrayList<Integer>();
        ArrayList<Integer> noP2 = new ArrayList<Integer>();
        ArrayList<Integer> noP3 = new ArrayList<Integer>();
        ArrayList<Integer> dipaiNo = new ArrayList<Integer>();

        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);
            if (i > 50) {
                dipaiNo.add(no);
            } else {
                if (i % 3 == 0) {
                    noP1.add(no);
                } else if (i % 3 == 1) {
                    noP2.add(no);
                } else {
                    noP3.add(no);
                }
            }
        }
        System.out.println(noP1);
        System.out.println(noP2);
        System.out.println(noP3);
        System.out.println(dipaiNo);
        //发牌创建 三个 玩家集合  创建一个底牌集合
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(dipaiNo);
        System.out.println("=============");
        for (Integer i : noP1) {
            player1.add(pockerMap.get(i));
        }
        for (Integer i : noP2) {
            player2.add(pockerMap.get(i));
        }
        for (Integer i : noP3) {
            player3.add(pockerMap.get(i));
        }
        for (Integer i : dipaiNo) {
            dipai.add(pockerMap.get(i));
        }
        System.out.println("玩家1：" + player1);
        System.out.println("玩家2：" + player2);
        System.out.println("玩家3：" + player3);
        System.out.println("底牌：" + dipai);
    }
}
