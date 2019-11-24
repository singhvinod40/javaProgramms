package random;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersactionLevel {

    public static void main(String[] args) {

        int [] array1 = {21, 34, 41, 22, 35};
        int [] array2 = {61, 34, 45, 21, 11};

        intersectionArrayy(array1,array2);
    }

    private static void intersectionArrayy(int[] array1, int[] array2) {

        Set<Integer> list = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());


        for(int i:list2){
            if(list.add(i)!=true){
                System.out.println(i);
            }
        }



    }


}
