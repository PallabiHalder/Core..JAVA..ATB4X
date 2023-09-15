package Sept.sept3.switchdemo;

public class Lab008 {

    public static void main(String[] args) {


        /* in  JDK >11, new feature introduced

         ** multiple case in same line in switch statement */

        int item = 004;


        switch (item) {

            case 001, 002, 003:

                System.out.println("from 1 to 3");
                break;

            case 004, 005, 007:

                System.out.println("from 4 to 7");

                break;

            default:
                System.out.println("Not found!!");

        }
    }

}