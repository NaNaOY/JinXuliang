package com.company.leetcode_work;

import java.util.Scanner;

public class HuiWenShu {
    private static class Solution {
        public boolean isPalindrome(int x) {
            int pop = 0;
            int ans = 0;
            int initial = x;
            while (x != 0) {
                pop = x % 10;
                x = x / 10;
                ans = ans * 10 + pop;
            }
            if (ans == initial && initial >= 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        Solution INT = new Solution();
        System.out.println(INT.isPalindrome(x));
    }
}
