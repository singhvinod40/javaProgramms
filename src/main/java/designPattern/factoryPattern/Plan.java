package designPattern.factoryPattern;

public abstract class Plan {

    int rate;
    abstract void getRate();
    void calculateBill( int unit){
        System.out.println(rate*unit);
   }
}
