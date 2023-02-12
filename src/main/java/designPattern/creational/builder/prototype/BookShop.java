package designPattern.creational.builder.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private  String shopName;
     List<Book> books = new ArrayList<>();

    public BookShop() {
    }


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

    public void loadData(){

        for(int i =0;i<=10;i++){

            Book book = new Book();
            book.setId(i);
            book.setName("book"+i);
            getBooks().add(book);
        }
    }

    //shallowCopy
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //deepCopy
    protected BookShop clone() throws CloneNotSupportedException{

        BookShop bookShop1 = new BookShop();

        for(Book b : this.getBooks()){
            bookShop1.getBooks().add(b);
        }

        return bookShop1;
    }
}
