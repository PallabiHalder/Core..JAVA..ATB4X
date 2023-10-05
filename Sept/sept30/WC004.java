package Sept.sept30;

public class WC004 {

    public static void main(String[] args) {

        Character  ch = 'a' ;

        char a = ch ; // unboxing happens here -> Character object to primitive conversion.

        System.out.println(Integer.max(10,50));



        Integer value = 10 ;

        value ++ ;

        System.out.println(value);  // o/p : 11

        Integer value2 = 10 ;

        System.out.println(value == value2); // false -> becoz different reference.



        int x = 20 ;

        int y = 20 ;

        System.out.println(x==y); // true



        String s1 = "Pallabi" ;

        String s2 = "Pallabi" ;

        System.out.println(s1==s2); // true becoz s1 and s2 are in same string pool.

        String s3 = new String ("Pallabi") ; // stored in heap area,

        System.out.println(s1==s3); // false.




    }
}
