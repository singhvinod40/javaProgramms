package random;

import java.util.*;
import java.util.stream.Collectors;

public class randomArray {
    public static void main(String[] args) {
        int sum=10;
        int[] arrray={1,5,3,7,9,8,15,74};
        pair(arrray,sum);
    }

    public static void pair(int[] array,int sum){

        List<Integer> list= Arrays.stream(array).boxed().collect(Collectors.toList());
        int tempsum=0;
        for(int i=0;i<=array.length-1;i++){
             tempsum= sum-array[i];

            if(list.contains(tempsum)){
                System.out.println("the pair is "+array[i] +" "+tempsum );
            }

        }

    }
}
