package algorithm;

public class MergeSorting {

    public static void main(String[] args) {

        int[] array = {14, 25, 7, 1, 0, 36, 955, 4, 1, 8, 3, 9, 0, 7};
        printArray(array);
        divide(array, 0, (array.length) - 1);
        System.out.println("After Sorting ");
        printArray(array);
    }

    static void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    public static void divide(int[] array, int start, int end) {

        if (start >=end){
            return;
        }
        int mid = start + (end - start)/ 2;
        divide(array, start, mid);
        divide(array, mid+1, end);
        conquer(array, start, mid, end);

    }

    public static void conquer(int []array, int start, int mid ,int end){

        int[] mergedArray = new int[end -start +1];

            int idx1 = start;
            int idx2 = mid+1;
            int x =0;


        while(idx1 <= mid && idx2 <=end){

            if(array[idx1]<=array[idx2]){
                mergedArray[x++] = array[idx1++];
            }else {
                mergedArray[x++] = array[idx2++];
            }
        }

        while (idx1<=mid){
            mergedArray[x++] = array[idx1++];
        }
        while (idx2 <=end){
            mergedArray[x++] = array[idx2++];
        }


        //copy merged array to original

        for(int i =0,j=start; i< mergedArray.length; i++,j++){
            array[j] = mergedArray[i];
        }

    }
}
