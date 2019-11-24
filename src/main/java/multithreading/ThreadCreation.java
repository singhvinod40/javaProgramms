package multithreading;

public class ThreadCreation extends Thread {

   public void run(){
                if(Thread.currentThread().isDaemon()){
                    System.out.println("demon");
                }
                else
                    System.out.println("user thread");


        }



    public static void main(String[] args) throws Exception {
        ThreadCreation t1=new ThreadCreation();
        ThreadCreation t2=new ThreadCreation();
        ThreadCreation t3=new ThreadCreation();
        t1.start();

//        t1.join();
        t2.setDaemon(true);
        t2.start();

        t3.start();


    }
}
