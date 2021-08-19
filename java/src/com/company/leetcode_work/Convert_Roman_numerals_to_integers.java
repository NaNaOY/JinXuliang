package com.company.leetcode_work;

import java.util.Scanner;

public class Convert_Roman_numerals_to_integers {
    public int romanToInt(String s) {
        int ans = 0;
        String pop = s;
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < pop.length(); i++) {
            str1 = s.substring(0, 1);
            str2 = s.substring(1);
            switch (str1) {
                case "I":
                    ans += 1;
                    break;
                case "V":
                    ans += 5;
                    break;
                case "X":
                    ans += 10;
                    break;
                case "L":
                    ans += 50;
                    break;
                case "C":
                    ans += 100;
                    break;
                case "D":
                    ans += 500;
                    break;
                case "M":
                    ans += 1000;
                    break;
            }
            if (i != 0) {
                if (((pop.charAt(i) == 'V') || (pop.charAt(i) == 'X')) && (pop.charAt(i - 1) == 'I'))
                    ans = ans - 1 * 2;
                if (((pop.charAt(i) == 'L') || (pop.charAt(i) == 'C')) && (pop.charAt(i - 1) == 'X'))
                    ans = ans - 10 * 2;
                if (((pop.charAt(i) == 'D') || (pop.charAt(i) == 'M')) && (pop.charAt(i - 1) == 'C'))
                    ans = ans - 100 * 2;
            }
            s = str2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Convert_Roman_numerals_to_integers num = new Convert_Roman_numerals_to_integers();
        System.out.println(num.romanToInt(s));
    }
}
