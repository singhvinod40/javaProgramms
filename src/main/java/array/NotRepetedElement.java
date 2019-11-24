package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NotRepetedElement {

    public static void main(String[] args) {

        int[] array2= {61, 34, 45, 21, 11,61,34,45,21};

        nonRepetiveElement(array2);

    }

    private static void nonRepetiveElement(int[] array2) {


        List<Integer> stream= Arrays.stream(array2).boxed().distinct().collect(Collectors.toList());
        System.out.println(stream);

    }
}
