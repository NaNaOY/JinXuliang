package com.company.work1;

import java.util.Scanner;

public class Solution {
    public Solution() {
    }

    public int reverse(int x) {
        int ans = 0;
        int pop = 0;
        while (x != 0) {
            pop = x % 10;
            x /= 10;
            if (ans > Math.pow(2, 31) / 10 || (ans == Math.pow(2, 31) / 10 && pop > 7)) {
                return 0;
            }
            if (ans < -Math.pow(2, 31) / 10 || (ans == -Math.pow(2, 31) / 10 && pop < -8)) {
                return 0;
            }
            ans = ans * 10 + pop;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        Solution INT = new Solution();
        System.out.println(INT.reverse(x));
    }

}


