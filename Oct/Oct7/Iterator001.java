package Oct.Oct7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator001 {

    public static void main(String[] args) {

        List<String> l = new ArrayList() ;

        l.add("Pallabi") ;

        l.add("Halder") ;

        System.out.println(l);


        System.out.println("-----------------------");


       // Applied Iterator below :


        Iterator i = l.iterator() ;

        while(i.hasNext()){

            System.out.println(i.next());
        }


        System.out.println("---------------------");



        // for each loop applied below :


        for(String s : l){

            System.out.println(s);
        }



    }
}
