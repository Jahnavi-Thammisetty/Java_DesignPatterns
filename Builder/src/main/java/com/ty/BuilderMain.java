package com.ty;

public class BuilderMain {
    public static void main(String[] args) {
        //Main purpose of creating builder is to avoid creation of multiple constructors
        //Because when we have a lot of parameters and we need a constructory for one or two or three according to the requirement this makes more complex
        //To avoid we use concept called "Builder Pattern"
     Product product1=new Product.Builder("Pro1").setName("bottel")
             .setQuality("Glass")
             .setPrice(500.0)
             .build();
     System.out.println(product1.getId());
     System.out.println(product1.getName());
     System.out.println(product1.getQuality());
     System.out.println(product1.getPrice());


     System.out.println();
     System.out.println("******************************");
     System.out.println();


     Product product2=new Product.Builder("Pro2").setName("Book")
                .setQuality("Unruled Note Book")
                .build();

     System.out.println(product2.getId());
     System.out.println(product2.getName());
     System.out.println(product2.getQuality());
     System.out.println(product2.getPrice());




    }
}