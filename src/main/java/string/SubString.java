package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubString {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1= br.readLine();
        String input2 = br.readLine();

        boolean result =isSubstring(input1,input2);
        if(result)
            System.out.println("is a valid substring");
        else
            System.out.println("not a valid substring");
}
        private static boolean isSubstring(String string,String subString) {

            if (subString.length() <= string.length()) {

                Pattern pattern = Pattern.compile(subString);
                Matcher m = pattern.matcher(string);
                return m.find();

            } else
                return false;


        }


}