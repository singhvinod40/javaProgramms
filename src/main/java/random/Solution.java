package random;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'getScoreDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numSeq as parameter.
     */

    public synchronized static int getScoreDifference(List<Integer> numSeq) {
        // Write your code here

        int player1 = 0;
        int player2 = 0;

        if(numSeq.size()==0){
            return 0;
        }
        if(numSeq.size()==1){
            return numSeq.get(0);
        }
        if(numSeq.size()==2){
            return numSeq.get(0)-numSeq.get(1);
        }
        boolean flag = true;

        for( int num : numSeq){

            if(flag){
                player1 = player1+num;
                numSeq.remove(0);
                if(num % 2 == 0){
                    Collections.reverse(numSeq);
                }
                flag = false;

            }else{
                player2 = player2+num;
                numSeq.remove(0);
                if(num % 2 == 0){
                    Collections.reverse(numSeq);
                }
                flag =true;
            }

        }
        return player1-player2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numSeqCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numSeq = new ArrayList<>();

        for (int i = 0; i < numSeqCount; i++) {
            int numSeqItem = Integer.parseInt(bufferedReader.readLine().trim());
            numSeq.add(numSeqItem);
        }

        int result = Result.getScoreDifference(numSeq);

        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
