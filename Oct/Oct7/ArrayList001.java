package Oct.Oct7;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList001 {

    public static  void main(String[] args) {

        ArrayList<Student002> students = new ArrayList();

        // Student 1

        Student002 s1 = new Student002("Lucky",45, 1);

        students.add(s1);


        // Student 2


        Student002 s2 = new Student002("Pramod",34, 2);

        students.add(s2) ;


        System.out.println(students.size()); // 2


        System.out.println("---------------");


        for (Student002 s: students){
            System.out.println(s.getName());
        }

        System.out.println("--------------------");




        Iterator iterator = students.iterator();


        while(iterator.hasNext()){
            Student002 temp = (Student002)iterator.next();
            System.out.println(temp.getName());
            System.out.println(temp.getAge());
        }


        System.out.println("-----------------------");



        ListIterator listIterator = students.listIterator();
        while (listIterator.hasNext()){
            Student002 temp = (Student002)listIterator.next();
            System.out.println(temp.getName());
            System.out.println(temp.getAge());
        }






    }

}


