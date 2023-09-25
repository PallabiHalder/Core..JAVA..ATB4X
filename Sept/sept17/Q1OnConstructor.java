package Sept.sept17;

public class Q1OnConstructor {

    public static void main(String[] args) {

        Person h=new Person();

        Person h2=new Person(23);

        Person h3=new Person(33,true);

        System.out.println(h.a); // 10

        System.out.println(h2.a); //  23

        System.out.println(h3.a); // 33

        System.out.println(h3.b); // true

        System.out.println(Person.c); // 90  // call static variable by using class name

        System.out.println(h3.c);  //  90   // call static variable by using reference

    }
}


class Person {

    int a;   // instance variable
    boolean b;  // instance variable


    static int c = 90;  // Static variable



    // Default constructor

    Person() {
        this.a = 10;

    }

    // Parameterized  Constructor  with single parameter

    Person(int b) {
        this.a = b;
    }


    // permeterized Constructor with double parameter

    Person(int b, boolean a) {
        this.a = b;
        this.b = a;

    }
}