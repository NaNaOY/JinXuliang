/**
 * @version 1.10 2004-02-10
 * @author Cay Horstmann
 */
package com.company.JavaLanguageBasics;

import java.util.*;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // get second input
        System.out.print("How old are you? ");
        int age = in.nextInt();
      
      
    /* int i;
     String value="100";
     i=Integer.parseInt(value);
     i=200;
     String s=String.valueOf(i);*/

        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));


    }
}
