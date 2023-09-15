package Sept.sept3.switchdemo;

import java.util.Scanner;

public class Lab001 {

    public static void main(String[] args) {



        // Take a User input - 1-7
        //  day 1 - monday
       //   day 3 -> wed


        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the day");

        int day = sc.nextInt();

       //  switch(Expression) : switch takes expression where if-else takes condition

        switch(day){

            case 1 :
                System.out.println("Monday");

                break ;

            case 2 :
                System.out.println("Tuesday");

                break;

            case 3 :
                System.out.println("Wednesday");

                break;

            case 4 :
                System.out.println("Thrusday");

                break;

            case 5 :
                System.out.println("Friday");

                break;

            case 6 :
                System.out.println("Saturday");

                break;

            case 7 :
                System.out.println("Sundayday");

                break;

            default:

                System.out.println("Invalid Day");
        }

        System.out.println("Outside the Loop = End");

    }
}
