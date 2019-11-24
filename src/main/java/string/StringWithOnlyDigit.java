package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringWithOnlyDigit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstInput = br.readLine();

        try {
        int a=    Integer.parseInt(firstInput);
            System.out.println("integer value " + a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
