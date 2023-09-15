package Sept.sept3.ifelse;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {



        //Grade Calculator

/*       Write a program that calculates and displays the letter grade for
         a given numerical score (e.g., A, B, C, D, or F)
         based on the following grading scale:

        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59  */


        // Take input from the user - score
        // score  > 90  and score < 100 ->  sout - 'A'
        // ELSE of score > 80 and score < 89 sout - 'B'


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your score");

        int score = sc.nextInt();

        char Grade ;


        if(score>=90 && score<=100) {
            Grade='A' ;
        }

        else if (score>=80 && score<=89) {

            Grade='B' ;

        }
        else if (score>=70 && score<=79) {

            Grade='C' ;
        }

        else if(score>=60 && score<=69) {

            Grade='D' ;
        }

        else{

            Grade='F' ;
        }

        System.out.println("Your Grade is " + " "+ Grade);

    }
}
