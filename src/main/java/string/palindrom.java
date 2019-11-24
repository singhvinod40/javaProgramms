package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class palindrom {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        palindrom(input);
    }

    private static  void palindrom(String input){

        String output="";
        for(int i=input.length()-1;i>=0;i--){

            output=output+input.charAt(i);
        }

        if(input.equals(output)){
            System.out.println(" is palindrom");
        }

        else{
            System.out.println(" not a palaindrom");
        }
    }
}
