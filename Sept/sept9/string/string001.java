package Sept.sept9.string;

import java.util.Locale;

public class string001 {

    public static void main(String[] args) {

        String s1 = " Pallabi "; //  will store in String pool

        String s2 = new String("Pallabi"); // will store in heap area.

      //  s1-> reference;

      //   s2 -> reference;

        // String s3 = "Pallabi"; // Pallabi

      //   s1 -> s3 -> "Pallabi" -> String pool

        /*Functions */

        System.out.println(s1.charAt(5));

        System.out.println(s1.toLowerCase(Locale.ROOT));

        System.out.println(s1.toUpperCase(Locale.ROOT));

        System.out.println(s1.trim());

        System.out.println(s1.equalsIgnoreCase("pallabi"));




    }
}
