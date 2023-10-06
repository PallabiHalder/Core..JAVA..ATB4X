package Oct.Oct7;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set005 {

    public static void main(String[] args) {



        Set hs = new HashSet() ;

        // Hashset store the elements how?
        //  Ans : Hashtable ->But No Order maintained here.

        hs.add("pallabi") ;

        hs.add("Kuchi") ;

        hs.add(null) ; // Null is allowed in Hashset.

        System.out.println(hs);


        System.out.println("-------------------------");


        Set lhs = new LinkedHashSet() ;

        lhs.add("Simi") ;

        lhs.add("Rimi") ;

        lhs.add("Mini") ;

        lhs.add(null) ; // Null is allowed in Linkedhashset.

        System.out.println(lhs);





        System.out.println("---------------------");


        Set treeSet = new TreeSet() ;

        treeSet.add("Chini") ;

        treeSet.add("Jimmy") ;

        treeSet.add("Rini") ;

        treeSet.add(null) ; // Treeset will not accept null. o/p : NullPointerException.

        System.out.println(treeSet);


        // Tree Set ??
        // Red and Black Tree




        // List of elements in Page.

        // We store without any order -> HashSET there no duplicate.

        /// maintain order -> LinkedHastSet.

        // Sort them by Alpha - TreeSet.





    }
}
