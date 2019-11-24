package java8;

public interface firstInterface {


    default void hello(){
        System.out.println("the first interface");
    }
    static double salary(int salary){
        return salary*100;
    }
}
