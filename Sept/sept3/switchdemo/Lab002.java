package Sept.sept3.switchdemo;

import java.util.Locale;
import java.util.Scanner;

public class Lab002 {

    public static void main(String[] args) {


        // vowels - 5 -> a,e,i,o,u

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a char");

        String vowel = sc.next();


        vowel = vowel.toLowerCase(Locale.ROOT);  // convert to lowercase


        switch (vowel){

            case "a" :
                System.out.println("Vowel");

                break;

            case "e" :

                System.out.println("Vowel");

                break;

            case "i" :

                System.out.println("Vowel");

                break;

            case "o" :
                System.out.println("Vowel");

                break;

            case "u" :
                System.out.println("Vowel");

                break;

            default :

                System.out.println(" Not a Vowel");
        }


    }
}
