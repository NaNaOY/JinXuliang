package com.company.CaiNiaoJava.Switch_Case;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        char grade = 'B';

        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        switch(a)
        {
            case 1 :
                System.out.println("优秀");
                break;
            case 2 :
            case 3 :
                System.out.println("良好");
                break;
            case 4 :
                System.out.println("及格");
                break;
            case 5 :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        switch(grade){
            case 'A' :
                System.out.println("who are you?");
                break;
            case 'B' :
                System.out.println("what your name?");
                break;
            default :
                System.out.println("gong ba ni!");
        }
        System.out.println("你的等级是 " + a);
    }
}
