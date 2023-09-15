package Sept.sept3.ifelse;

import java.util.Scanner;

public class FindMaxNumber {

    public static void main(String[] args) {

        // Find maximum number by if-Statement and take input from user

        System.out.println("Enter the value of a, b, c" + "\n" + "I will print maximum number" );

        Scanner sc= new Scanner(System.in) ;

        int a= sc.nextInt();

        int b= sc.nextInt();

        int c= sc.nextInt();


        if(a>b && a>c){
            System.out.println("Max is" + " "+  a);
        }

        if (b>a && b>c){
            System.out.println("Max is" + " " +b);
        }

        if (c>a && c>b){
            System.out.println("Max is" + " " + c);
        }
    }
}
