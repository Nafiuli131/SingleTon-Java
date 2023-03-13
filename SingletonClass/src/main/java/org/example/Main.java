package org.example;

public class Main {
    public static void main(String[] args) {
        //this is not possible, because we add private constructor here
//        SingleTon singleTon = new SingleTon();
        SingleTon singleTon = SingleTon.getInstance(); //here create one object of singletone class
        SingleTon singleTon1 = SingleTon.getInstance(); //here only reference of this object call not create new object
        SingleTon singleTon2 = SingleTon.getInstance(); //same condition
    }
}