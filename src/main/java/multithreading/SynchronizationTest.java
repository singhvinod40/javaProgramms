package multithreading;

public class SynchronizationTest {

    public static void main(String[] args) {

        Shared s1 = new Shared();

        Thread t1 = new Thread(){

            @Override
            public void run(){
               s1.shareMethod();
            }
        };

        Thread t2 = new Thread(){

            @Override
            public void run(){
                s1.shareMethod();
            }

        };

        t1.start();
        t2.start();
    }
}

class Shared{


    int i;

    synchronized void shareMethod(){

        Thread t =      Thread.currentThread();

        for(int i = 0;i<10;i++){
            System.out.println(t.getName());
            System.out.println(i);
        }
    }
}
