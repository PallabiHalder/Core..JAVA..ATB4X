package Sept.sept9.array;

import java.util.Scanner;

public class MaxValueOfArray {

    public static void main(String[] args) {


        // Find maximium value from a array

        System.out.println("Enter the subject count");

        Scanner sc = new Scanner(System.in);

        int total_subject = sc.nextInt();



        int[] marks = new int[total_subject] ;

        for (int i = 0; i < marks.length; i++) {

            System.out.println("enter the marks one by one");


          marks[i] = sc.nextInt(); // marks[0],marks[1],marks[2]
        }

        for (int i = 0; i < marks.length ; i++) {


            System.out.println("Here is your marks of subject ->" + marks[i]);

        }

        int max = marks [0];   // take 0 indexed element as max.

        for (int i = 0; i < marks.length ; i++) {

            if (marks[i] > max) {

                max = marks[i];
            }
        }
            System.out.println("The max value is " + max);


    }
}
