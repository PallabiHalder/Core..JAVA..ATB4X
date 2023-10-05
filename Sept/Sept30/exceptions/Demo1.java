package Sept.Sept30.exceptions;

public class Demo1 {

    public static void main(String[] args) {


        // Pass the argument - "10" - y
        // Convert this into the 10 wrapper of Integer
        //  x= 10/y
        // print x;


        String s1 = args[0]; // 1 java.lang.ArrayIndexOutOfBoundsException -(arg = No value)

        int y = Integer.parseInt(s1); // 2 - java.lang.NumberFormatException ( (pallabi) String -> int? )

        int x = 10/y; //3 - java.lang.ArithmeticException ( arg = 0)

        System.out.println(x);

        /*

        1. JVM will be Initialized

        Create and Starts the main Thread.

        main Thread will do the following tasks

        1)Collects the Command Line Arguments

        2)Creates the String array with CLA

        3)Calls main method by passing String array as Parameter:

        PSVM.main(str);

        Now Control will be transfered from main Thread to main method

        Control will come back to main thread in two ways.

         Exceptiotn -> Main thread will terminated

         Exception???


        */


    }
}
