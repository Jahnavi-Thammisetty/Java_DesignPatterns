package com.ty;


public class PrototypeMain {

//    Prototype pattern refers to creating duplicate object while keeping performance in mind.
//    This type of design pattern comes under creational pattern as
//    this pattern provides one of the best ways to create an object.
    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bookShop=new BookShop();
        bookShop.setShopName("BooksStall");
        bookShop.LoadData();
        System.out.println(bookShop);

        BookShop bookShop2=bookShop.clone();
        bookShop.getBooks().remove(2);
        bookShop2.setShopName("!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(bookShop2);


    }
}