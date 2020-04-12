package com.itheima.api;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        demo01();
    }

    public static Date demo02() {
        return null;
    }

    public static void demo01() {
        //当前系统的时间
        Date date = new Date();
        System.out.println(date);
        System.out.println("================");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String s = dateFormat.format(date);
        System.out.println(s);
        System.out.println("====================");
        try {
            Date parse = dateFormat.parse(s);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("1111");
        System.out.println("1111");
        System.out.println("0111");
    }
}
