package Oct.Oct7;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIterator002 {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();

        // Add values to the array list.


        al.add(1);
        al.add(2);
        al.add(-3);
        al.add(-4);
        al.add(5);


// getting Spliterator object on al


        Spliterator<Integer>  spltItr1 = al.spliterator() ;

        ArrayList  tempList = new ArrayList() ;



        while(spltItr1.tryAdvance((n) -> tempList.add(Math.abs(n))));



        System.out.println(tempList);


    }
}
