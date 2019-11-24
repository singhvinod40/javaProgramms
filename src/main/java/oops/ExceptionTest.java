package oops;


import java.io.IOException;

public class ExceptionTest implements parent {

    public static void main(String[] args) throws Exception {
        ExceptionTest exceptionTest = new ExceptionTest();
        ExceptionTest exceptionTest1 = new ExceptionTest();
        System.out.println("befre exception");

            int z = exceptionTest.run();

            System.out.println(z);
        System.out.println("after exception");
        System.out.println(exceptionTest1.findstring());
    }


    public String findstring()throws RuntimeException {
        return " vinod";
    }

    @Override
    public int run() throws RuntimeException{
        int a = 5;
        int b = 0;

        try {

            int c = a / b;
            return c;

        }
        catch (Exception e) {
        e.printStackTrace();
        }
            finally
         {
            System.out.println("exception catched");
        return 5;
        }


    }
}
interface parent {
    int run() throws RuntimeException;
    class a{}
}

