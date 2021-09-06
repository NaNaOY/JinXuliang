package com.company.leetcode_work;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {


    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        int key = 9;
        Binary_search binary_search = new Binary_search();
        System.out.println(binary_search.rank(key, a));
        System.out.println(5 / 2);
    }
}

