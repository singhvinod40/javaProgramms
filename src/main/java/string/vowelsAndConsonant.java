package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class vowelsAndConsonant {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        vowelsAndConsonant(input);
    }

    private static void vowelsAndConsonant(String input){

        char[]charArray=input.replaceAll("[\\d]","").toLowerCase().toCharArray();

        int vowels=0;
        int consonant=0;

        for(char c: charArray){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }

            else
            consonant ++;
        }

        System.out.println("Number of vowels " + vowels);
        System.out.println("Number of consonant " + consonant);

    }
}
