package com.company.leetcode_work;

import java.util.Scanner;

public class Public_Prefix {
        public static void mian(String[] args){
            String[] strs=new String[]{};
            for(int i=0;i<strs.length;i++) {
                Scanner scan = new Scanner(System.in);
                strs[i]=scan.next();
            }
            Public_Prefix pub=new Public_Prefix();
            System.out.println(pub.longestCommonPrefix(strs));

        }

        public String longestCommonPrefix(String[] strs) {
            if(strs.length==0)return "";
            //公共前缀比所有字符串都短，随便选一个先
            String s=strs[0];
            for (String string : strs) {
                while(!string.startsWith(s)){
                    if(s.length()==0)return "";
                    //公共前缀不匹配就让它变短！
                    s=s.substring(0,s.length()-1);
                }
            }
            return s;
        }
    }

