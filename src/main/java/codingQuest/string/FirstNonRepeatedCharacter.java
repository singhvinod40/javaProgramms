package codingQuest.string;

import java.util.*;

public class FirstNonRepeatedCharacter {
    // tofind the firt non repeated character in a given string.

    public static void main(String[] args) {


        String s ="FirstNonRepeatedCharacter";
        nonRepeaed(s);
        nonRepeaed("analogy");
        nonRepeaed("easiest");


    }

    private static void nonRepeaed(String s){

        char toretur = 0;
        if (s == null)
                throw new RuntimeException();
        else if(s.length() ==1)
            System.out.println(s);
        else {
            LinkedHashMap<Character,Integer> lm = new LinkedHashMap<>();

            for(char c: s.toCharArray()){
                lm.put(c,lm.getOrDefault(c,0)+1);
            }

            for(Map.Entry<Character,Integer> i : lm.entrySet()) {

                if (i.getValue() == 1){
                    System.out.println(" FirstNonRepeated   " + i.getKey());
                    break;
                }
            }

        }
    }
}
