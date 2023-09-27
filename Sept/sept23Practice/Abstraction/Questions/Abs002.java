package Sept.sept23Practice.Abstraction.Questions;

public class Abs002 {  // Main Class

    public static void main(String[] args) {

    Student s= new Student() ;

    s.say();



    }
}

 abstract class  Person { // abstract class

    abstract void say ();  // abstract method

    void eat(){   // complete method

        System.out.println("Hello eat from Person");

        }

}


class  Student extends Person {


    @Override
    void say() {  // to complete say() method

        System.out.println("Complete Say from student");
    }
}
