package Oct.Oct1;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {

    public static void main(String[] args) {


        Vector<String> vector = new Vector<>(); // initialize vector



        // Stack001, Hashtable, Properties, Dictionary --> Legacy classes.



        // Adding elements


        vector.add("Java");
        vector.add("Python");
        vector.add("C++");


        // Enumeration


        Enumeration e = vector.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}


//  Need to remember line 24 to line 27 --> Similar to iteration.

// Enumeration is only available in legacy classes.
