package Oct.Oct7;

import java.util.HashSet;
import java.util.Set;

public class Set003 {

    public static void main(String[] args) {

        Set hs = new HashSet() ;


        // ArrayList - Dynamic Array
        // LinkedInList -> Doubly LinkedList001, Nodes
        // Vector - Dynamic Array ,Thread Safe
        // Stack001 - LIFO (Expand)



        // HashSet - mean? How they are storing the values in HastSet
        // Hastable - ??


        HashSet hs2 = new HashSet() ;

        hs2.add("pallabi") ;

        hs2.add("halder") ;

        hs2.add(123) ;

        hs2.add(004) ;


        System.out.println(hs2);

        System.out.println(hs2.size());


        System.out.println("---------------------");

      hs2.remove(123);

      System.out.println(hs2);


        System.out.println("----------------------");


        hs2.clear();

        System.out.println(hs2); // O/P : Empty.






    }
}
