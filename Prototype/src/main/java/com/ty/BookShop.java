package com.ty;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String shopName;

    private List<Book> books=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }


    public void LoadData()
    {
        for (int i=1;i<=10;i++)
        {
            Book book=new Book();
            book.setId("book"+i);
            book.setName("Three Mistakes");
            book.setPrice(500.0);
            getBooks().add(book);
        }
    }
//Normal clone
//     @Override
//    protected Object clone() throws CloneNotSupportedException {
//         return super.clone();
//     }
 //Deep Clone
@Override
protected BookShop clone() throws CloneNotSupportedException {
    BookShop shop=new BookShop();

    for(Book b: this.getBooks())
    {
      shop. getBooks().add(b);
    }
    return shop;
}


}
