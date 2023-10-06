package Oct.Oct7;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.TreeSet;

class Student2 {


    // Student class with id, name, and age


    private int id ;

    private String name ;

    private int age ;


    // Constructor

    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    // Getters for id, name, and age

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    // toString method for better printing of objects


    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}


// SortById


/* class SortById2 implements Comparator<Student2> {


     @Override
     public int compare(Student2 o1, Student2 o2) {

         if (o1.getId() > o2.getId()) {
             return 1;
         }

         if (o1.getId() < o2.getId()){

             return -1 ;
         }

         else {

             return 0 ;
         }

     }

 }




 */


//SortByID : Optional : We can use Compare () method also for id.


class SortById implements Comparator<Student2>{


    @Override
    public int compare(Student2 o1, Student2 o2) {

        return Integer.compare(o1.getId(), o2.getId()) ;
    }
}



 //SortByName

 class SortByName implements Comparator<Student2>{


     @Override
     public int compare(Student2 o1, Student2 o2) {


         return  o1.getName().compareTo(o2.getName()) ;
     }
 }





public class Comparator002 {

    public static void main(String[] args) {

        // Creating a TreeSet of Students using a custom Comparator (based on id)

       TreeSet<Student2> student2TreeSet = new TreeSet<>(new SortById());


        // Creating a TreeSet of Students using a custom Comparator (based on name)

      //  TreeSet<Student2> student2Set = new TreeSet<>(new SortByName());


        // Adding students to the TreeSet


        student2TreeSet.add(new Student2(101,"Rohit",26));

        student2TreeSet.add(new Student2(102,"Mohit",28));

        student2TreeSet.add(new Student2(103,"Romit",24));


        // Printing the TreeSet


        System.out.println("Student2 (SortById) : ");

        for ( Student2 student2 :   student2TreeSet ) {

            System.out.println(student2);

        }



    }
}
