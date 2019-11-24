package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonArray {
    public static void main(String[] args) {

        int[] array1= {21, 34, 41, 22, 35};
        int[] array2= {61, 34, 45, 21, 11};

        List<Integer> list= commonElement(array1,array2);

    }

    public static List<Integer> commonElement(int[] array1, int[] array2) {

        List<Integer> list1= Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Integer> list2= Arrays.stream(array2).boxed().collect(Collectors.toList());

        list1.retainAll(list2);

        System.out.println("common element " + list1);

        return list1;
    }
}
