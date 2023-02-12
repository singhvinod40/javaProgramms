package algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


        int array[] = {12, 32, 43, 67, 76, 45, 32, 11, 23, 76, 44, 88, 98, 55, 100, 123, 432};
        Arrays.sort(array);

        int toFind = 55;
        int length = array.length - 1;


        BinarySearchClass ob = new BinarySearchClass();

        int index = ob.binarySearch(array, 0, length, toFind);

        if (index == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +
                    index);


    }
}

class BinarySearchClass {

    protected int binarySearch(int[] array, int start, int length, int toFind) {

         if(length>=0){

             int mid = start + (length - start)/ 2;;

             if(array[mid]==toFind){
                 return mid;
             }
             if(array[mid]>toFind){
                 return binarySearch(array,start,mid-1,toFind);
             }else {
                 return binarySearch(array,mid+1,length,toFind);
             }
         }
         else
             return -1;


    }
}

