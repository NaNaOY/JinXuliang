package com.company.CaiNiaoJava.Inheritance;


class Fruit {
    public String colour;
    public double price;
    public String name;

    public Fruit(String myName, String myColour) {
        colour = myColour;
        name = myName;
    }

    void price() {
        System.out.println("My price is:");
    }

    void introduction() {
        System.out.println("My name is:" + name + "\nMycolour is:" + colour);
    }
}

class Apple extends Fruit {
    public Apple(String myName, String myColour) {
        super(myName, myColour);
    }
    void myPrice(double price){
        System.out.println("My price is:"+ price);
    }
    void introduction() {
        super.introduction();
    }

    void price(double price) {
        super.price();
        this.myPrice(price);
    }
}

public class TestApple {
    public static void main(String[] args) {
        Apple apple = new Apple("XiaoHong", "red");
        apple.price(12.5);
        apple.introduction();
    }
}
