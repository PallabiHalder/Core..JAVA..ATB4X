package Oct.Oct7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set004 {

    public static void main(String[] args) {


        Set courseSets = new HashSet(); // Dynamic Dispatch

        // Father Interface can have ref to child class Object

        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add(123);
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);

        System.out.println("---------------------");


        for(Object o :  courseSets){
            System.out.println(o);
        }


        System.out.println("-------------------------");



        Iterator it = courseSets.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }






    }
}
