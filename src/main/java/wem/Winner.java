package wem;

public class Winner {
    public static void main(String[] args) {
        String Erice="E";
        String Bob="H";
        String s =winner(Erice,Bob);
        System.out.println(s);

    }


    public static String winner(String erica, String bob) {
        // Write your code here

        int ericatotal = scoreCount(erica);
        int bobTotal= scoreCount(bob);
        System.out.print(ericatotal);
        System.out.print(bobTotal);
        if(ericatotal > bobTotal){
            return "Erica";
        }
        else if( ericatotal == bobTotal){
            return "Tie";
        }
        else
            return "Bob";


    }
    public static int scoreCount(String input){
        int SumToReturn = 0;
        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i) == 'E'){
                SumToReturn = SumToReturn +1;
            }
            else if(input.charAt(i) == 'M'){
                SumToReturn = SumToReturn +3;
            }
            else if (input.charAt(i) == 'H'){
                SumToReturn = SumToReturn +5;
            }

        }
        return SumToReturn;
    }
}
