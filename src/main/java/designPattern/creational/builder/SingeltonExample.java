package designPattern.creational.builder;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingeltonExample implements Serializable, Cloneable {

        private static volatile SingeltonExample soleInstance=null;
    private SingeltonExample(){
        if(soleInstance!=null){
            throw new RuntimeException(" instance already exist use getInstance");
        }
        System.out.println("inside constructor");
    }

    public static synchronized SingeltonExample getInstance(){

        if(soleInstance==null){

            soleInstance=new SingeltonExample();
        }
        return soleInstance;
    }

    public Object readResolve() {
        System.out.println("read resolve is called");
        return soleInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("cannot clone object");

    }
}

class Test{

    public static void useInstance(){
        SingeltonExample singeltonExample=SingeltonExample.getInstance();
        print(" multithreding",singeltonExample);
    }
    public static void main(String[] args) throws Exception{

        SingeltonExample s1=SingeltonExample.getInstance();
        SingeltonExample s2=SingeltonExample.getInstance();

        print(" singleton s1",s1);
        print(" singleton s2",s2);

//        //voilation br reflection
//        Class cls=Class.forName("designPattern.creational.builder.SingeltonExample");
//        Constructor con= cls.getDeclaredConstructor();
//        con.setAccessible(true);
//        SingeltonExample s3=(SingeltonExample)con.newInstance();
//        print("  reflection",s3);

        //break by serliazation
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("/s2.ser"));
//        oos.writeObject(s2);
//
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("/s2.ser"));
//        SingeltonExample s4=(SingeltonExample)ois.readObject();
//        print("seriliazion ",s4);
//
//        //cloneable
//        SingeltonExample s5=(SingeltonExample)s1.clone();
//        print("cloneable",s5);
//
        //break by multithread
        ExecutorService service=Executors.newFixedThreadPool(2);
        service.submit(Test::useInstance);
        service.submit(Test::useInstance);


        service.shutdown();


    }

    public static void print(String string,SingeltonExample s){
        System.out.println("the hashCode of the instance"+ string+ " is -: " + s.hashCode());
    }
}
