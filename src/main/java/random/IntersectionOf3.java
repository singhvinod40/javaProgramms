package random;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOf3 {

    public static void main(String[] args) {
        int[] input1 = {1, 5, 10, 20, 40, 80};
        int[] input2 = {6, 7, 20, 80, 100};
        int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};


        intersection(input1,input2,input3);
    }

    private static void intersection(int[] input1, int[] input2, int[] input3) {

        Set<Integer> set1= Arrays.stream(input1).boxed().collect(Collectors.toSet());
        Set<Integer> finalset=new HashSet<>();

        for(int i:input2){
          if( !set1.add(i))
              finalset.add(i);
        }
        for(int i:input3){
            if(!finalset.add(i)){
                System.out.println(i);
            }
        }
    }

}