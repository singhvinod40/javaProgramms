package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstInput = br.readLine();
        String secondInput = br.readLine();

        if(firstInput.length()==secondInput.length())
                isAnagram(firstInput, secondInput);
            else
                System.out.println("Not an anagram");

    }

    private static void isAnagram(String firstInput, String secondInput){

        char[]firstInputarray=firstInput.toCharArray();
        char[]secondInputarray=firstInput.toCharArray();

        Arrays.sort(firstInputarray);
        Arrays.sort(secondInputarray);

        if(Arrays.equals(firstInputarray,secondInputarray)){
            System.out.println("is Anagram");
        }

        else{
            System.out.println("not an anagram");
        }
    }
}
