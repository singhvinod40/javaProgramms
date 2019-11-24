package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class firstNonRepetitve {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstInput = br.readLine();


        if(firstInput.length()!=0)
            firstNonRepetitve(firstInput);
        else
            System.out.println("invalid input");
    }

    private static void firstNonRepetitve(String input){

        char[] inputchar=input.toCharArray();

        Map<Character,Integer>map=new LinkedHashMap<Character, Integer>();
        for( char c: inputchar ){

            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else
                map.put(c,map.get(c)+1);
        }

        Set<Map.Entry<Character,Integer>>set=map.entrySet();
        for (Map.Entry<Character,Integer> temp:set){
            if(temp.getValue()==1){
                System.out.println("first non repetitvr character is  " + temp.getKey());
                break;
            }
        }
    }

}
