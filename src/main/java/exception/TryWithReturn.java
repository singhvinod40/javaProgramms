package exception;

public class TryWithReturn {
    public static void main(String[] args) {

        String s=test();
        System.out.println(s);
    }

        public static String test(){

        try {
            String abc="abc";
            return abc;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            String def="def";
            return def;
        }
        }
}
