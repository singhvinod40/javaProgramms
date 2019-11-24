package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Validsuffle {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1= br.readLine();
        String input2 = br.readLine();
        String input3 = br.readLine();
         boolean isvalidsuffle=false;
        try{
            if(input1.length()+input2.length()==input3.length())
                isvalidsuffle= validsufflemethod(input1,input2,input3);
            if(isvalidsuffle){
                System.out.println("its a valid suffle");
            }
            else {
                System.out.println("not a valid suffle");
            }
        }
        catch (Exception e){

        e.printStackTrace();
        }
    }

    private static boolean validsufflemethod(String A,String B,String C){

        int i=0,j=0,k=0;

      while (k!=C.length()-1){

          //first character of c with first character of c
          if(i<A.length()&&A.charAt(i)==C.charAt(k))
              i++;

          else if(j<B.length()&&B.charAt(j)==C.charAt(k))
              j++;

          else
              return false;

          k++;
      }
        return true;


    }
}
