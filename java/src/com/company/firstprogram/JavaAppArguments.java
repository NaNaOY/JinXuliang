package com.company.firstprogram;

import java.text.NumberFormat;

public class JavaAppArguments {
    public static void main(String[] args) {
        double sum = 0;
        System.out.println("参数个数：" + args.length);
        for (String arg : args) { //遍历求和
            sum = sum + Integer.parseInt(arg);//将String类型转换为int类型
        }
        System.out.println(sum);

        int number1 = 1_000_000;
        int number2 = 1000000;
        System.out.println(number1 == number2);//true
        //使用当前区域语言特性格式化数字
        NumberFormat format = NumberFormat.getInstance();
        System.out.println(format.format(number1));//1,000,000
    }
}