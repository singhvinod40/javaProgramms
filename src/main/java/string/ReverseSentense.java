package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseSentense {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        revereSentense(input);
}

       private static void revereSentense(String input){

        String[] input1 = input.split("\\s");

        for(int i=input1.length-1; i>=0;i--){
            System.out.println(input1[i]);
        }

       }
}