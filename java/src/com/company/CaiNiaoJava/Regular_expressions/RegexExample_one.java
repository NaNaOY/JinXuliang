package com.company.CaiNiaoJava.Regular_expressions;
import java.util.regex.*;
public class RegexExample_one {
    public static void main(String[] args){
        String content="I am noob"+"from runoob.com.";

        String pattern=".*runoob.*";

        boolean isMatch=Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了'runoob'子字符串？\n"+isMatch);
    }

}
