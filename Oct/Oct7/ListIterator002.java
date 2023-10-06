package Oct.Oct7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIterator002 {

    public static void main(String[] args) {

        List<String> l= new ArrayList();

        l.add("Kuchi") ;

        l.add("Halder") ;


        System.out.println(l);


        System.out.println("-----------------");



        // Applied ListIterator below :


        ListIterator   listIterator = l.listIterator() ;



        while(listIterator.hasNext()){

            System.out.println(listIterator.next());


        }


        System.out.println("------------------");



       // ListIterator can be used for List only.

       // ** ListIterator has hasNext() and hasPrevious() both functions ** .





        while(listIterator.hasPrevious()){

            System.out.println(listIterator.previous());

        }











    }



}