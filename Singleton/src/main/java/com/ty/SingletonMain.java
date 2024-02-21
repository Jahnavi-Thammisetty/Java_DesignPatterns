package com.ty;


public class SingletonMain {

    public static void main(String[] args) {

        SingleObject object1=SingleObject.getInstance();

        SingleObject object2=SingleObject.getInstance();

        if(object1.equals(object2))
        {
            System.out.println(object1+"           "+object2);
            System.out.println("Singleton Class is created");
        }
        else System.out.println("Singleton Class is Not Created");

    }
}