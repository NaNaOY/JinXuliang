package com.company.CaiNiaoJava.Object;

public class Sta {
    private static String str1 = "staticProperty";
    private String str2 = "prooperty";

    public Sta() {
    }

    public void print1() {
        System.out.println(str1);//正常，可以访问静态成员变量
        System.out.println(str2);
        print2();//正常，可以访问静态成员方法
    }

    public static void print2() {
        System.out.println(str1);
        //System.out.println(str2);报错，不可访问。str2非静态成员变量
        //print1();报错，不可调用。 print1非静态成员方法

        //正确解答
        Sta stA=new Sta();
        System.out.println(stA.str2);
        stA.print1();

    }
    public static void main(String[] args) {
        Sta sta = new Sta();
        sta.print2();
    }
}
