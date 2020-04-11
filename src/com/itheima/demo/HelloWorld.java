package com.itheima.demo;

public class HelloWorld {
    public static void  main(String[] args){
        System.out.println("你好！");
        int b = 10;
        System.out.println(b);
        int a = 20;
        int c = a > b ? a : b;
        System.out.println("最大值："+c);
        int max;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        System.out.println("最大值："+max);
        byte byte1 = 10;
        byte1 += byte1;
        //1到100的偶数和
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
