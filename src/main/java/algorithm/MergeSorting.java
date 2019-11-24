package algorithm;

public class MergeSorting {

    public static void main(String[] args) {

        int[] array = {14,25,7,1,0,36,955,4,1,8,3,9,0,7};
        printArray(array);
        merge(array,0,array.length-1);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
    }

    static void merge(int[] array, int i, int i1){

    }
}
