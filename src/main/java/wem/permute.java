package wem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class permute
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Set<String> set=findpermute(input);
        System.out.println(set);
    }

    private static Set<String> findpermute(String str){

        Set<String> perm = new HashSet<>();

        if(str ==null){
            return null;
        }
        else if(str.length()==0){
            perm.add("");
            return perm;
        }
        else if (str.length()==1){
            perm.add(str);
            return perm;
        }

        char initial = str.charAt(0);
        String remaing = str.substring(1);
        Set<String> words = findpermute(remaing);

        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }
    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }
}