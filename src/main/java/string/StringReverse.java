package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringReverse {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstInput = br.readLine();


        if(firstInput!=null &&firstInput.length()!=0)
            stringReverse(firstInput);
        else
            System.out.println("invalid input");
    }

    private static void stringReverse(String input){

        if(input.length()!=1){

            String output="";
            for(int i=input.length()-1;i>=0;i--){
                output=output+input.charAt(i);
            }
            System.out.println("reverse of string is " + output);
        }
        else{
            System.out.println("reverse of string is" + input);
        }


    }
}
