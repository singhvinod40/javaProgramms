package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateCharacterWithCount {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        try {
            if (input != null && input.length() != 0)
                duplicateCharacterWithCount(input);
            else
                System.out.println("invalid input");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        private static void duplicateCharacterWithCount(String input){

        char[] inputchar=input.toCharArray();
            int count=1;
        Map<Character ,Integer> finalMap=new HashMap<Character, Integer>();
       // Map<Character ,Integer> duplicatefinalMap=new HashMap<Character, Integer>();

        for(char s:inputchar ){
            if(finalMap.containsKey(s))
                finalMap.put(s, finalMap.get(s)+1);
            else
                finalMap.put(s, 1);
        }

            Set<Map.Entry<Character,Integer>> entrySet=finalMap.entrySet();
            for(Map.Entry<Character,Integer>entry:entrySet ){
                if(entry.getValue()>1)
                System.out.println("duplicate key  "+entry.getKey() + "  count " + entry.getValue());
            }
        }
}
