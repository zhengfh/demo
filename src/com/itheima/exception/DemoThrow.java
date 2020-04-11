package com.itheima.exception;

import java.io.FileNotFoundException;

public class DemoThrow {
    public static void main(String[] args) {
        int[] arr = null;
        try {
            getElement(arr, 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("-----------------");
            System.out.println("e:" + e.toString());
            System.out.println("==================");
            System.out.println(e.getMessage());
        }
    }

    private static void getElement(int[] arr, int index) {

//        try {
//            int i = arr[index];
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            throw new NullPointerException("传入的数组为null");
//        }
        if (arr == null) {
            throw new NullPointerException("传入的数组为null");
        }
        int i = arr[index];
    }
}
