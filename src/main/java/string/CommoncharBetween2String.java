package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommoncharBetween2String {
    public static void main(String[] args) throws IOException {

        String s1 = "forgeekps", s2 = "practicefor";


        String commonChars = "";
        for (int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if (s2.indexOf(ch) != -1)
            {
                commonChars = commonChars + ch;
            }
        }

        System.out.println(commonChars);

    }
}