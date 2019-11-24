package random;

public class LargestandSmallestInarray {
    public static void main(String[] args) {
        int[] arrray={1,5,3,7,9,8,15,74};
        LargestandSmallestInarrayNumber(arrray);
    }

    public static void LargestandSmallestInarrayNumber(int[] array){

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);

        for(int i=0;i<array.length;i++){

            if(array[i]<min)
                min=array[i];
            else
                if(array[i]>max){
                    max=array[i];
                }
        }
        System.out.println("the minimum value is" +min);
        System.out.println("the maximum value is" +max);
    }
}
