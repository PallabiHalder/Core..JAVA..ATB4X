package Sept.sept2;



public class Lab003 {

    public static void main(String[] args) {


     /*   byte b=128;       // Out of range [ range of byte -128 to +127]
        System.out.println(b);


       boolean b2= TRUE ;  // wrong

       boolean b3= true;  //  true should in small.  */


        char c1= 'B';
        System.out.println(c1);


        char c2= '5';
        System.out.println(c2);


        char c3= '*';
        System.out.println(c3);

        System.out.println(c3+c3);  // It will not give o/p as *+* = **

        /*   + operator in Java  Behave differently - ASCII Char
             + is doing something that we don't know   */


        // Another example

        char c4='/';

        System.out.println(c4);

        System.out.println(c4+c4); // It will take ASCII value


    }

}
