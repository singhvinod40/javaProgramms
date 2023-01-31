package designPattern.builder;

public class Shop {
    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("anderiod").setBattery(3000).getPhone() ;

        System.out.println(p);
    }




}
