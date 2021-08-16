package com.company.CaiNiaoJava.Object;

public class Puppy {
    int puppyAge;//成员变量
    int puppySize;//成员变量

    public Puppy(String name) {
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是：" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为 : " + puppyAge);
        return puppyAge;
    }

    public void setSize(int size) {
        puppySize = size;
    }

    public int getSize() {
        System.out.println("小狗的大小为 : " + puppySize);
        return puppySize;
    }

    public static void main(String[] args) {
        //下面的语句将创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
        /* 通过方法来设定age */
        myPuppy.setAge(2);
        myPuppy.setSize(5);
        /* 调用另一个方法获取age */
        myPuppy.getAge();
        myPuppy.getSize();
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.puppyAge + "、" + myPuppy.puppySize);
    }
}

