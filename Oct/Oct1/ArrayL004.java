package Oct.Oct1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayL004 {

    public static void main(String[] args) {


        ArrayList<String> stringList = new ArrayList();

        stringList.add("pallabi");
        stringList.add("halder");
        stringList.add("kuchi");


        System.out.println(stringList);



        //** Enhanced For loop

        for (String s:stringList){ // data type should be same in line 11 and 20.
            System.out.println(s);
        }

        System.out.println("-----------");



        // Iterate over the List

        // Using Iterator Interface



        Iterator iterator = stringList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

// ** need to remember line 30 to 34.




           //** Note **

// ** we use iterator in ArrayList.

// ** We use Enumeration in Vector.
