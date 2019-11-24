package java8;

import java.util.Comparator;

public class SortingCompartor implements Comparator<String> {

    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

    public void hello(){
        System.out.println("hello from Sorting class compartor");
    }
    public static double salary(int salary){
        return salary*4000;
    }
}
