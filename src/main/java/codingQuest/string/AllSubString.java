package codingQuest.string;

import java.util.Collections;
import java.util.List;

public class AllSubString {
    // hackerrank   https://www.hackerrank.com/challenges/between-two-sets/problem
    //fin count of numbers that is a factors for both array


    public static void main(String[] args) {


    }

    private int findCommonFacotr(List<Integer> a, List<Integer> b) {

        a.sort(Collections.reverseOrder());
        b.sort(Collections.reverseOrder());

        boolean flag = true;
        int counter = 0;

        for (int num = a.get(0); num <= b.get(b.size()); num++) {

            for (int avalue : a) {

                if (avalue % num != 0) {
                    flag = false;
                }

                if (flag) {
                    for (int valb : b) {
                        if (valb % num != 0) {
                            flag = false;
                        }
                    }
                }

                if (flag)
                    counter++;
            }


        }


        return counter;


    }
}
