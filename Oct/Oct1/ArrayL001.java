package Oct.Oct1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayL001 {

    public static void main(String[] args) {

        // List is an interface.

        // ArrayList is a class.

        List list = List.of("A", "B") ;  // List Declaration.

        ArrayList  list1  = new ArrayList (10) ; // can add capacity.


       // ArrayList is dynamic and mutable in nature.


        List  list2 = new ArrayList() ; // Dynamic Dispatch.

        // Child object can have Father's reference.


        // Addition in ArrayList is allowed.


        list1.add("Pallabi") ;

        list1.add("halder") ;

        list1.add("kuchi") ;

        list1.add("halder") ; // duplicate in ArrayList in allowed.


     //   list1.add(123) ; // different types of data can be added ArrayList.

        System.out.println(list1);

        System.out.println(list1.size());

        System.out.println(list1.isEmpty());

        list1.remove("halder") ; // remove by object.

        list1.remove(0) ;  // remove by index.

        System.out.println(list1);


        list1.add(null) ;  // null is allowed also in arrayList.

        System.out.println(list1);


      // Sorting.

      //  Collections.sort(list1);  // if null is present, sorting is not possible.


      list1.remove(null) ;

        System.out.println(list1);


       Collections.sort(list1); // sorted alphabetically.


        System.out.println(list1);

    }
}
  // if there is different types of data ex : String and integer.. sorting is not possible.