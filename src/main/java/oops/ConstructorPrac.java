package oops;
import java.util.*;
import java.util.*;
import java.util.*;

abstract class abstractTest {

    static int a=10 ;
    final void run(){
        System.out.println("runinnggg");
    }
    abstract  void running();
}
    interface apple {

       abstract void newapple();
      static void vinod(){
        System.out.println("vinod");
          }
          static void vinod2(){
              System.out.println("seconf static");
          }
          String toreturn(String s);
        }
public class ConstructorPrac extends abstractTest implements apple{

    public static void main(String[] args) {
        apple.vinod();
        ConstructorPrac constructorPrac=new ConstructorPrac();
       String s= constructorPrac.toreturn("toreutnrddddddddddd");
        System.out.println(s);
        ConstructorPrac constructorPrac1=new ConstructorPrac();
        constructorPrac1.run();
        ConstructorPrac constructorPrac2=new ConstructorPrac();
        constructorPrac2.running();
        System.out.println(a);
        apple.vinod2();



    }
    @Override
    public void newapple() {

    }

    @Override
    public String toreturn(String s) {

        return s;
    }

    @Override
    void running() {
        System.out.println("abstract method");
    }
}

