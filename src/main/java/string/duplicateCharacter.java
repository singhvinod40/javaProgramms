package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class duplicateCharacter  {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();

        try{
            if(input!=null && input.length()!=0){
                duplicateCharacter(input);
            }
            else
                System.out.println("invalid input");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static  void duplicateCharacter(String input){

            char[] characters=input.toCharArray();
            Set<Character>duplicate=new HashSet<Character>();

            for(char c:characters){
                if(!duplicate.add(c))
                System.out.println("duplicate character is -: " + c);

        }
            if(input.length()==duplicate.size()){
                System.out.println("no duplicate in string");
            }

    }
}
