package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        //准备牌盒
        ArrayList<String> pokerBox = new ArrayList<>();
        //创建花色
        ArrayList<String> colors = new ArrayList<>();
        //创建数字
        ArrayList<String> numbers = new ArrayList<>();
        //分别给花色 以及 数字集合添加元素
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        //创建牌
        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("小☺");
        pokerBox.add("大☠");
        System.out.println(pokerBox);
        //洗牌
        Collections.shuffle(pokerBox);
        //发牌创建 三个 玩家集合  创建一个底牌集合
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if (i > 50) {
                dipai.add(card);
            } else {
                if (i % 3 == 0) {
                    player1.add(card);
                } else if (i % 3 == 1) {
                    player2.add(card);
                } else {
                    player3.add(card);
                }
            }
        }
        System.out.println("玩家1：" + player1);
        System.out.println("玩家2：" + player2);
        System.out.println("玩家3：" + player3);
        System.out.println("底牌：" + dipai);
    }
}
