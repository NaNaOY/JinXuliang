package com.company.CaiNiaoJava.Array;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        double[] arrayRefVar;
        int size = 10;
        double total = 0;
        double[] myList = new double[size];
        for (int i = 0; i < size; i++) {
            Scanner scan = new Scanner(System.in);
            myList[i] = scan.nextDouble();
            total += myList[i];
        }
        System.out.println("总和为:" + total);

    }
}
