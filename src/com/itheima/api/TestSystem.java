package com.itheima.api;

public class TestSystem {
    /**
     * @param args src - 源数组。
     *             srcPos - 源数组中的起始位置。
     *             dest - 目标数组。
     *             destPos - 目标数据中的起始位置。
     *             length - 要复制的数组元素的数量。
     *             将src数组中前3个元素，复制到dest数组的前3个位置上
     *             复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
     *             复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
     */
    public static void main(String[] args) {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.print("[");
        for (int i = 0; i < src.length; i++) {
            if (i == src.length - 1) {
                System.out.print(src[i] + "]");
            } else {
                System.out.print(src[i] + ",");
            }
        }
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < dest.length; i++) {
            if (i == dest.length - 1) {
                System.out.print(dest[i] + "]");
            } else {
                System.out.print(dest[i] + ",");
            }
        }
        System.out.println("=================");
        String str = "abc";
        String str2 = str + "b";
        System.out.println(str == str2);
        StringBuilder stringBuilder = new StringBuilder("abc");
        StringBuilder append = stringBuilder.append("b");
        System.out.println(stringBuilder == append);
        System.out.println("========");
        //构造方法装箱
        Integer integer = new Integer(10);
        System.out.println(integer);
        Integer integer1 = new Integer("20");
        System.out.println(integer1);
        //成员方法装箱
        Integer integer2 = Integer.valueOf(30);
        Integer integer3 = Integer.valueOf("40");
        //字符串转为int
        int i = Integer.parseInt("50");
        //成员方法拆箱
        Integer in = 9;
        int i1 = in.intValue();
    }


}
