package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KthSmallest {
    public static void main(String[] args) {

        int[] array2= {61, 34, 45, 21, 11,61,34,45,21};

        kthsmallest(array2,4);
        kthLargest(array2,4);

    }

    private static void kthLargest(int[] array2, int i) {

        List<Integer>list= Arrays.stream(array2).boxed().sorted().distinct().collect(Collectors.toList());
        System.out.println(list);
        System.out.println("kth largest Number "+list.get(list.size()-i));
    }

    private static void kthsmallest(int[] array2, int k) {

        List<Integer> list = Arrays.stream(array2).boxed().sorted().distinct().collect(Collectors.toList());
        System.out.println(list);
        System.out.println("the "+k+" smallest number is -: "+list.get(k-1));

    }

}
