package com.itheima.demo;

public class TestArray {
    public static void main(String[] args) {
        int[]  arr= new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {

        }
        for (int i : arr) {

        }

        for(int min = 0, max = arr.length - 1; min <= max; min++, max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
