package com.ty;

import com.ty.mac.MacUiFactory;
import com.ty.windows.WindowsUiFactory;

public class AbstractFactoryMethodMain {
//    Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories.
//    This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
//
//In Abstract Factory pattern an interface is responsible for creating a
// factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

    public static void main(String[] args) {
        Application application1=new Application(new WindowsUiFactory());
        application1.point();
        System.out.println();
        System.out.println("*******************************");
        System.out.println();
        Application application2=new Application(new MacUiFactory());
        application2.point();


    }
}
