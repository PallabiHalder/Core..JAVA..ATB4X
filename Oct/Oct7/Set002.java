package Oct.Oct7;




import java.sql.SQLOutput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set002 {

    public static void main(String[] args) {

        // question:

        /* List of Students who wants to take part in Event
         It contains duplicate, some students have done
         Registration twice or thrice, How we will remove the
         Duplicate ?

         Set or List

          */


        // Ans : SET.


        Student002 s1 = new Student002("pallabi", 29 , 1);

        Student002  s2 = new Student002("Jimmy", 30, 2) ;

        Student002 s3 = s1  ;

        Student002  s4 = new Student002("pallabi", 29 , 1);



        // s1 == s4 but How set will know?
        // id s1 == id s4 - then it is duplicate set will remove



     List<Student002> studentList = new ArrayList<>() ;


     studentList.add(s1) ;

     studentList.add(s2) ;

     studentList.add(s3) ;

     studentList.add(s4) ;


        System.out.println(studentList);

        System.out.println(studentList.size());


        if(s1.equals(s3)){
            System.out.println("True"); // In list


            //Ans : SET ->

            // Set will not add the Element or Item
            // s3 will not be printed!!
        }



        Set<Student002> studentSet = new HashSet<>() ;

        studentSet.add(s1) ;

        studentSet.add(s2) ;

        studentSet.add(s3) ;

        studentSet.add(s4) ;

        System.out.println(studentSet);

        System.out.println(studentSet.size()); // 3 // as reference is different eventhough
                                               // values are same.

    }
}
