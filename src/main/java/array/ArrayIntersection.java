package array;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static void main(String[] args) {
        int[] array1={21, 34, 41, 22, 35};
        int[] array2={61, 34, 45, 21, 11};

        Set<Integer> commonNumber=new HashSet<>();

        for(int a:array1){
            commonNumber.add(a);
        }
        for(int b:array2){
            if(!commonNumber.add(b)){
                System.out.println(b);
            }
        }
    }
}
