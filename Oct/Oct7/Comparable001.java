package Oct.Oct7;

import java.util.Set;
import java.util.TreeSet;

public class Comparable001 {

    public static void main(String[] args) {

        Set<Student002> studentSet = new TreeSet() ;

        Student002 s1 = new Student002("Akash",22,107);

        Student002  s2 = new Student002("Bikash",22,107) ;

        Student002  s3 = new Student002("Prakash",35,110) ;



        studentSet.add(s1) ;

        studentSet.add(s2) ;

        studentSet.add(s3) ;

        System.out.println(studentSet); // Got ClassCastException.

                                        // As different datatypes used, so sorting interrupted.

                                        // Solution : Comparator.


        System.out.println(studentSet.size());



        // Treeset don't know How I have to sort the S1 AND S2?

        // If by id --> Different mechanism.

        // If by id or name --> Different Mechanism.



      //  Note :  Comparable -> id or name or age - > (only one time).

        // Comparator -> class for attribute  SortById and  SortByName and SortByAge.
                         //(Multiple times).



    }
}
