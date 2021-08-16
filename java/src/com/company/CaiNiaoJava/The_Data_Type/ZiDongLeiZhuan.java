package com.company.CaiNiaoJava.The_Data_Type;

public class ZiDongLeiZhuan {
    public static void main(String[] args) {
        char c1 = 'a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char 自动类型转换为int后的值等于" + i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2 + 1;//char类型和int类型计算
        System.out.println("char类型和int计算后的值等于" + i2);
    }
}
//其中将字符转换为对应的ASCII码，a对应的int类型值为97，A对应值为65，所以i2=65+1=66