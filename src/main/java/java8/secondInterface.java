package java8;

public interface secondInterface  extends firstInterface{

    default void hello(){
        firstInterface.super.hello();

        System.out.println("in default second interface");
    }
}
