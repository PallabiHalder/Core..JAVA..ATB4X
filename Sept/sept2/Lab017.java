package Sept.sept2;

public class Lab017 {

    public static void main(String[] args) {


       int b= 10;

        // pre decrement = plz decrement me before assign

       System.out.println(--b + --b); // =17

        /*

       --b =  exp = 9 , b=9

       + =

       --b = exp=8 , b=8

         */

     // post decrement // plz assign me then decrement

      System.out.println(b-- + --b); // 18 ( Add exp values)

        /*

        b-- =  10, exp = 10, and after b=9

        +

        --b = exp value= 8, b=8


       */


        int d=101;

        System.out.println(--d); // 100

        System.out.println(d--); // 100

        System.out.println(d);  // 99


      //  final  int pie =3;
     //   System.out.println(pie++); // not possible as declared as final
    }
}
