package com.company.CaiNiaoJava.Date;
import java.util.*;
import java.text.*;
public class DateDemo_one {
    public static void main(String args[]){

        Date dNow=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("2121-08-19 14:06:55");

        System.out.println("当前时间为："+ft.format(dNow));
    }
}
