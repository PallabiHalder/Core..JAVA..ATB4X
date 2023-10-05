package Oct.Oct1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayL003 {

    public static void main(String[] args) {

        ArrayList a = new ArrayList(); //Son - 25

        List l = new ArrayList(); // Father - 15

        //ArrayList<E> extends AbstractList<E>

        //implements List

        // Collection - Interface for the other List, Set and Queue

        Collection c = new ArrayList(); // grand father - 10

        c.add("Pallabi");

        System.out.println(c);

        // Collections // Ultility Class
    }
}
