package Oct.Oct7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HSvsLHSvsTS {


    public static void main(String[] args) {


        Set<Integer> integerSet = new HashSet<>();


        integerSet.add(123456);
        integerSet.add(12345);
        integerSet.add(1234);
        integerSet.add(123);
        integerSet.add(12);

        integerSet.add(null); // Null is allowed.

        System.out.println(integerSet);

        System.out.println("-------------------");


        Set<Integer> integerSet2 = new LinkedHashSet<>();


        integerSet2.add(123456);
        integerSet2.add(12345);
        integerSet2.add(1234);
        integerSet2.add(12);
        integerSet2.add(123);

        integerSet2.add(null);
        integerSet2.add(null); // It will take one 'null', becoz duplicate is not allowed.

        System.out.println(integerSet2);


        System.out.println("---------------------------");



        Set set3 = new TreeSet<>();


        //123456 -> In red and black tree -> Left If value less than Firstnumber, Right -if value is greater than first number.



        set3.add(123456);
        set3.add(12345);
        set3.add(1234);
        set3.add(12);
        set3.add(123);

     //  set3.add(null); // Not possible becoz default sorting will happens here.


        set3.add("Lucky"); // ClassCastException -> becoz Treeset occurs default sorting.
                           // so, different datatype is not accepted.


        System.out.println(set3);
    }
}
