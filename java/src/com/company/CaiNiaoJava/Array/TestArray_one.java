package com.company.CaiNiaoJava.Array;

public class TestArray_one {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        int[] array = {1, 2, 4, 3, 5, 6};
        //打印所有数组元素
        for (double element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();
        TestArray_one.printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
