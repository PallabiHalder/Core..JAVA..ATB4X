package Sept.sept3.switchdemo;

import java.util.Scanner;

public class Lab011 {

    public static void main(String[] args) {

        //Interview Question

        /* Simulate a traffic light with three possible states: "Red," "Yellow," and "Green.
         "Write a program that takes an integer representing the current
         state of the traffic light and prints the next state.
         Use a switch statement to cycle through the states.  */



        /* Red -> Yellow -> Green -> rED -> India
           Red -> Green -> USA
           Yellow -> Red -> Green -> Canada */



        //    1 : Red -> Yellow

        //    2 : yellow -> Green

        //    3 : Green -> Red


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current state of Traffic Light");

        int state = sc.nextInt();


        switch (state) {

            case 1:
                System.out.println("Next will be Yellow");

                break ;

            case 2:

                System.out.println("Next will be Green");

                break ;

            case 3:

                System.out.println("Next will be Red");

                break ;

            default:                                      // default can use in any line under switch statement

                System.out.println("Invalid state");


        }
    }
}
