package designPattern.prototype;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {


        BookShop bs = new BookShop();
        bs.setShopName("Shop1");
        bs.loadData();
        System.out.println(bs);


        BookShop bs1 = (BookShop) bs.clone();
        bs1.setShopName("Shop B");


        System.out.println(bs1);


    }
}
