package com.ty;

public class Rectangle implements  Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }

    @Override
    public void message() {
      System.out.println("Thanks For Drawing Rectangle");
    }
}
