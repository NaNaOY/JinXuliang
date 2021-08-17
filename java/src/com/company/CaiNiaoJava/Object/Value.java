package com.company.CaiNiaoJava.Object;

import jdk.internal.dynalink.beans.StaticClass;

public class Value {
    static int value=33;

    public static void main(String[] args)throws Exception{
        new Value().printValue();
    }

    private void printValue(){
        int value=3;
        //this.value=value; 如果该对象没有赋值，则value=3不可能跟对象关联，则对象的值是33
        System.out.println(this.value);
    }
}
