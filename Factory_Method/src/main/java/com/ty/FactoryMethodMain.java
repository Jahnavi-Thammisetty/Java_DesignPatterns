package com.ty;

public class FactoryMethodMain {
    public static void main(String[] args) {


        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Rectangle and call its draw method.
        Shape shape1 = shapeFactory.getShape("RECTANGLE");

        //call draw method and message method of Rectangle
        shape1.draw();
        shape1.message();

        System.out.println("**********************************");



        //get an object of Square and call its draw method.
        Shape shape2 = shapeFactory.getShape("SQUARE");

        //call draw method and message method of  square
        shape2.draw();
        shape2.message();


    }
}