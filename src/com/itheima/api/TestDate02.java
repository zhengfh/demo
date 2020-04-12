package com.itheima.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strBirthday = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date birthdayDate = sdf.parse(strBirthday);
            Date nowDate = new Date();
            long l = nowDate.getTime() - birthdayDate.getTime();
            long days = l / 24 / 60 / 60 / 365 / 1000;
            System.out.println(days);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
