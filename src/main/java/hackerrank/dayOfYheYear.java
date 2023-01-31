package hackerrank;

public class dayOfYheYear {

    //  hackerRank  https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true
    public static void main(String[] args) {

        System.out.println(dayOfProgrammer(1800));
    }

    public static String dayOfProgrammer(int year) {
        // Write your code here

        int day = 0;

        if (year > 1917) {

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                day = 12;
            else day = 13;

            if (year == 1918) {

                day = 26;
            }

            return day + ".09." + year;

        } else {
             if((year%4==0)|| ((year % 4 == 0) && (year % 100 != 0)))

                day = 12;
            else
                    day = 13;


            return day + ".09." + year;


        }


    }
}
