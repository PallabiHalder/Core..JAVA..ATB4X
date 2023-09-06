package Sept.sept2;

public class Lab015 {

    public static void main(String[] args) {


        int b=1;

      //  System.out.println(++b + ++b +b); =8


        /*  break down 1 st

         ++b = exp= 2 and b= 2

        + =

        ++b =  exp= 3 and b=3

        + =

        b= 3

         */

        System.out.println(b+ ++b + ++b + b); // =9

        /* break down 1st

        b= exp= 1 and b=1

      +

      ++b= exp=2 and b=2

      +

      ++b= exp=3 and b=3

      +

      b= 3
         */
    }
}
