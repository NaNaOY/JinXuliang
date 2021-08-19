package com.company.CaiNiaoJava.String;

public class StringDemo {
    public static void main(String[] args){
        char[] helloArray={'r','u','n','o','o','b'};
        String helloString= new String(helloArray);
        System.out.println(helloString);

        String site1="www.runoob.com";
        String site2="菜鸟教程";
        //对象可以访问构造函数
        int len=site1.length();
        System.out.println("菜鸟教程网址长度："+len);
        System.out.println(site1.concat(site2));
        
    }
}
