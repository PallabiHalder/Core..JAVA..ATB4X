package Sept.sept16.string;

public class StringBufferStringBuilder {

    public static void main(String[] args) {

        String s1 = "Pallabi";

        String s2 = "Halder";

      /*  s2 = s1+s2;

        System.out.println(s2);

        for (int i = 0; i <1000 ; i++) {

            System.out.println(s2);

        }

       */


        /* String Buffer : 1. Use String Buffer when values changes a lot
                           2. Less time and **Thread Safe**

         */

        StringBuffer sb = new StringBuffer("Pallabi");

        for (int i = 0; i <1000 ; i++) {

            System.out.println(sb.append(s2));

        }





           // String Builder :  **Not Thread Safe**




            StringBuilder  sbb = new StringBuilder("Halder");

            for (int j = 0; j <1000 ; j++) {

                System.out.println(sbb.append(s1));

            }





        }

    }

