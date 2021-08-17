package com.company.CaiNiaoJava.The_Modifier;

public class Test {
    final int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    public void changeValue(){
        //value = 12; 将输出一个错误因为是final则不可更改数值
    }

    public final void changeName(){
        //方法体
    }
    public final class Test1{
        //类体
    }

}

