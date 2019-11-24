package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HigestOccouredCharacteer {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char c =highestReturnCharacterInString(input);
        System.out.println("most repetitve character is  "+c);

    }

    public static char highestReturnCharacterInString(String input) {

        char toReturn = 'c';
        char[] inputArray = input.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();

        for (char c : inputArray) {
            if (!map.containsKey(c)) {
                map.put(c, 1);

            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        map.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
        });

        int max = 1;
        Set<Map.Entry<Character, Integer>> mp = map.entrySet();
        for (Map.Entry<Character, Integer> temmp : mp) {
            if (temmp.getValue() >= max) {
                max = temmp.getValue();
            }


        }

        System.out.println("max ix " + max);


        for(Map.Entry<Character,Integer> temmp: mp){
            if(temmp.getValue()==max){
                toReturn= temmp.getKey();
            }

        }
//
       return toReturn;

    }
}
