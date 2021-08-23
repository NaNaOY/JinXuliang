package com.company.leetcode_work;

import java.util.Scanner;

public class Gets_the_maximum_value_in_the_array {

    public int getMaximumGenerated(int n) {
        int nums[] = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int ans = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            nums[i] = i % 2 == 0 ? nums[i / 2] : (nums[i / 2] + nums[(i + 1) / 2]);
            ans = Math.max(ans, nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Gets_the_maximum_value_in_the_array Max = new Gets_the_maximum_value_in_the_array();
        System.out.println(Max.getMaximumGenerated(n));
    }

}
