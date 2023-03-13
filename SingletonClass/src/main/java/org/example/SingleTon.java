package org.example;

public class SingleTon {

    //create this static class to create signleton object
    static SingleTon singleTon = new SingleTon();

    //create private constructor, so other class cannot access this class and cannot create object of this class
    private SingleTon(){
        System.out.println("invoke this class and create object this class");
    }

    //now we can create object this class by calling getinstance method. and here create only one object of this
    static SingleTon getInstance(){
        return singleTon;
    }
}
