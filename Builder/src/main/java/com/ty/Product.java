package com.ty;

 class Product {
  //variables
    private String id;
    private String name;
    private String quality;
    private double price;
//Getters And Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getQuality() {
         return quality;
     }

     public void setQuality(String quality) {
         this.quality = quality;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }
     // Private constructor
    private Product(Builder builder) {
     this.id=builder.id;
     this.name=builder.name;
     this.quality=builder.quality;
     this.price=builder.price;
    }
//Inner class
   static class Builder {

            // Required parameters
            private String id;
            private String name;
            private String quality;
            private double price;

            // Constructor with required parameters
            public Builder(String id) {
                this.id = id;
            }

            // Setter methods for optional parameters
            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setQuality(String quality) {
                this.quality = quality;
                return this;
            }

            public Builder setPrice(double price) {
                this.price = price;
                return this;
            }

            // Build method to create the meal
            public Product build() {
                return new Product(this);
            }
        }

}
