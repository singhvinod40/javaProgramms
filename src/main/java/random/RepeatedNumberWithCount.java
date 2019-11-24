package random;

import java.util.*;

public class RepeatedNumberWithCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(1);
        RepeatedNumberWithCountNumber(list);
    }

    private static void RepeatedNumberWithCountNumber(List<Integer>numbers) {
        int count = 0;
        int[] array = new int[numbers.size()];

        for(int i = 0; i < numbers.size(); i++) {array[i] = numbers.get(i);}
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else
                map.put(i, 1);
        }

        Set<Integer> set = map.keySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {

            Object key = itr.next();
            if (map.get(key) > 1) {
                count++;
            }
        }
        System.out.println(count);

    }
}