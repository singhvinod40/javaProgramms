package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortStringOnLength {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        SortString(input);
}
        private static void SortString(String input){

        String [] inputArray=input.split("\\s");

            Map<Integer, String> sorted=new TreeMap<Integer, String>();
            for(String s: inputArray){

                sorted.put(s.length(),s);
            }

            System.out.println(sorted);

            Set<Integer> mp =  sorted.keySet();
            for(int i=0;i<=mp.size();i++){
                System.out.println();
            }
    }


}
