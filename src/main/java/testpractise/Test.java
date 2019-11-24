package testpractise;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(3);

        System.out.println(min(list));
    }

    public static long calculateAmount(List<Integer> prices) {
        // Write your code here
        long totalsum=0;

        int[] array = new int[prices.size()];
        for(int i = 0; i < prices.size(); i++) {array[i] = prices.get(i);}

        if(array.length ==1){
            totalsum =totalsum+array[0];
        }
        else{
            List<Integer>list=new ArrayList<>();
            list.add(array[0]);
            for(int i=1;i<array.length;i++){
                int a=array[i];
                totalsum =totalsum + (a-(min(list)));
                list.add(array[i]);
            }
        }

        return totalsum;
    }
                private static int min(List<Integer>list){
                return list.stream()						// Stream<Integer>
                        .min(Comparator.naturalOrder()) // Optional<Integer>
                        .get();
            }
    }
