package Oct.Oct1;

import java.util.Vector;

public class CollectionF002 {

    public static void main(String[] args) {

        int [] a = new int[10] ;

        //  Fixed Size;
        // Insert and Delete -> heavy operation
        // Store only one type of element - similar integer



        a[0] = 10; // int can be accepted.


        //a[1] = "Pramod"; // String can't be accepted.

        // Vector - Vector class is a legacy class (introduced in jdk 1.2)

        // Java 8 - re written this class.


        // Note : Vector can store different types of elements.


        Vector v = new Vector() ;


       // 1.  addition in vector

        v.add(1);

        v.add("Pallabi");

        v.add("Kuchi");

        System.out.println(v);


        // 2. Replace

        v.set(0,2) ;  // It means index 0 will replace with 2.

        System.out.println(v);


        // 3. Deletion in vector


        v.remove(0);

        System.out.println(v);

        v.remove(1) ;

        System.out.println(v);



        // Note :

        // Vector - initial capacity - 10

        // when store 9th element, it will double in size ( up to 20th) (internally)


    }
}
