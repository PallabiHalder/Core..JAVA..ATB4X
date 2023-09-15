package Sept.sept9.array;

import java.util.Scanner;

public class array005 {

    public static void main(String[] args) {


        System.out.println("Enter how many elements you want to store");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[]  userArray = new int[n];

        for (int i = 0; i < userArray.length ; i++) {

            System.out.println(userArray[i]);

        }
    }
}
