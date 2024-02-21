package com.ty;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }

    @Override
    public void message() {
        System.out.println("Thanks for Drawing Square");
    }

}
