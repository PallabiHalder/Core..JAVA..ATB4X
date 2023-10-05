package Oct.Oct1;

import java.util.ArrayList;
import java.util.List;

public class ArrayL002 {

    public static void main(String[] args) {

   List l = new ArrayList() ; // Dynamic Dispatch.

        l.add("Pallabi");

        l.add(123);

        l.add("Halder") ;

        System.out.println(l);

        System.out.println(l.size());

        System.out.println(l.indexOf(123));

        l.remove(0); // Remove by index only suppported in ArrayList.

        System.out.println(l);


        l.add(2,"Kuchi");

        System.out.println(l);

        l.set(2,"Puchi") ; // set is used for replace.

        System.out.println(l);


        // Q2. if you want to restrict the arrayList.


        List<String> l2 = new ArrayList<>() ;

        l2.add("Rohit");

     //   l2.add(567) ; // after restricted to string, integer add will show error.

        System.out.println(l2);


        System.out.println("-----------------------");



        List<String> names_of_students = new ArrayList();

        List<Integer> roll_no = new ArrayList();

        names_of_students.add("Pramod"); // Alright.

        //names_of_students.add(123); -->  This will give error.

        System.out.println(names_of_students);

        //roll_no.add("pramod");  --> This will give error.

        roll_no.add(123);  // Alright.

        System.out.println(roll_no);








    }
}
