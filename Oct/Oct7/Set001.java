package Oct.Oct7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set001 {


    public static void main(String[] args) {

        //List

        List l = new  ArrayList() ;  // List can accept duplicate elements.

          l.add("pallabi") ;

          l.add("pallabi") ;

          l.add("pallabi") ;

        System.out.println(l);


        System.out.println("-----------------");

        //SET


        Set s = new HashSet() ; // SET will not accept duplicate values.
                                // It accepts only unique values.

        s.add("kuchi") ;

        s.add("kuchi") ;

        s.add("kuchi") ;


        System.out.println(s);







    }
}
