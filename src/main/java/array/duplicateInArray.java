package array;

import java.util.*;

public class duplicateInArray {
    public static void main(String[] args) {
        int[] array=new int[] { 0,3, 1, 2, 3,2,7,8,15 };

        Arrays.stream(array).distinct().forEach(System.out::println);
        Set<Integer> set=new LinkedHashSet<>();

       for(int i:array){
        if(!set.add(i))
            System.out.println("duplicate number is " +i);
       }

       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
        for(int i:array){

            if(i>max){
                max=i;
            }
            else if(i>min){
                min=i;
            }
        }

        System.out.println("smallest NUmber is " + max);
        System.out.println(" largest NUmber is " + min);
    }
}
