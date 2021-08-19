package com.company.CaiNiaoJava.The_enumeration;



public class MeiJuTest {

    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }

}
class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;
}