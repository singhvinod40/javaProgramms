package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HigestOccouredCharacter {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        higestOccouredCharacter(input);
    }

    private static void higestOccouredCharacter(String input) {

        int count = 1;
        int max = 1;
        char maxChar = input.charAt(1);

        for (int i = 1; i < input.length(); i++) {
            count = (input.charAt(i) == input.charAt(i - 1)) ? (count + 1) : 1;
            if (count > max) {
                max = count;
                maxChar = input.charAt(i);
            }
        }

        System.out.println("Longest run: " + max + ", for the character " + maxChar);
    }

}