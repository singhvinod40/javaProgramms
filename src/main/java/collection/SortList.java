package collection;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>();
                list1.add(1);
                list1.add(3);
                list1.add(4);
                list1.add(6);

                List<Integer>list=new ArrayList<>();
                list.add(11);
                list.add(15);
                list.add(16);
                list.add(0);
                list.add(1);

                list1.addAll(list);
        Collections.sort(list1);
        System.out.println(list1);

        Map<String,Integer>map=new HashMap<>();
        map.put("vinod",1);
    }

}
