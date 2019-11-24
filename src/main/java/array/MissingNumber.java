package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) throws Exception {

        System.out.println("enter the num of element");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Scanner scn = new Scanner(System.in);
        int totalSum=totalSum(n);

        int[] inputarray = new int[n];

        System.out.println("total sum is "+totalSum);
        for(int i=0; i<n-1; i++ ) {
            inputarray[i] = scn.nextInt();
        }

        int inputsum= Arrays.stream(inputarray).sum();

        System.out.println("input sum is " +inputsum);

        System.out.println("missing num is "+(totalSum-inputsum));
    }

    public static int totalSum(int n){

        int sum;
        return sum=(n*(n+1))/2;

    }

}
