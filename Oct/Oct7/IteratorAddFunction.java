package Oct.Oct7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAddFunction {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>() ;

         l.add("Rimi") ;

         l.add("Simi") ;

         l.add("Chini") ;




        System.out.println(l);


        System.out.println("--------------------");


        Iterator i = l.iterator() ;


       // l.add("Mini") ; // It will give ** ConcurrentModificationException ** interview question.

       // i.add("Tinni") ; // As Iterator don't have add() function.


        while(i.hasNext()){

            System.out.println(i.next());
        }


        System.out.println("------------------");


        i.remove( ) ; // It will remove the last element.


        System.out.println(l);

        System.out.println("------------------------------");




        ListIterator  l2= l.listIterator() ;


        while(l2.hasNext()){

            // l.add("Tinni") ; Not Possible

            l2.add("Tinni");

            System.out.println(l2.next());
        }



    }
}
