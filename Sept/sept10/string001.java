package Sept.sept10;

public class string001 {

    public static void main(String[] args) {

        String s1= "Hello";

        String s2= "Hello";

        String s3= new String ("Hello");

        System.out.println(s1==s2); // true

        System.out.println(s2==s3);  //false

        // '=='  operator checks if two string references point to the same memory location.





        System.out.println(s1.equals(s2)); //true

        System.out.println(s1.equals(s3));// true


        // equals method compares the actual content of the strings,

        // checking if they contain the same sequence of characters.
    }
}
