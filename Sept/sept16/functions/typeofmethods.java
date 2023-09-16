package Sept.sept16.functions;

public class typeofmethods {

    public static void main(String[] args) {

        /* Types of method :

        1. return with parameter.

        2. No return with parameter.

        3. return with no parameter.

        4. no return with no parameter.

         */

        String output = appendHalder("Pallabi");

        System.out.println(output);

        print("Pallabi");

        appendHalder();

        print();




    }


       static String appendHalder (String s){

           System.out.println("return with parameter");

            return (s+"Halder");

    }


    static void  print  ( String s){

        System.out.println("No return with parameter");

        System.out.println("print some" +s);

    }


    static String appendHalder (){

        System.out.println("return with no parameter");

       return ("Halder");

    }


    static void  print ( ){

        System.out.println("no return with no parameter");

    }



}
