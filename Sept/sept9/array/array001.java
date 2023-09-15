package Sept.sept9.array;

public class array001 {

    public static void main(String[] args) {


        // array is a collection of same type of elements.


        int math = 90;

        int eng = 95;

        int  sc = 98;

        int ben = 80;

        int [] marks = {90, 95, 98, 80};  // array declaration -> type 1

        // array index starts from '0' index.


        System.out.println(marks[0]);

        System.out.println(marks[1]);

        System.out.println(marks[2]);

        System.out.println(marks[3]);

       // System.out.println(marks[4]);  // JVM will give tight slap :)


        System.out.println("-------------------------------");


        int [] marks2  = new int [4] ;  // array declaration -> type 2 // 4 is length of array here.


        marks [0] = 10;

        marks [1] = 20;

        marks [2] = 30;

        marks [3] = 40;


        System.out.println(marks[2]);

       //  System.out.println(marks[4]); //  JVM will give tight slap :)

    }
}
