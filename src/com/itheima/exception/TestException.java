package com.itheima.exception;

public class TestException {
    public static void main(String[] args) throws MyException {
        print();
    }

    public static void print() throws MyException {
        throw new MyException("异常");
    }
}
