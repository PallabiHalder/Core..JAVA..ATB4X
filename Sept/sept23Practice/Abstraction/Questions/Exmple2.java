package Sept.sept23Practice.Abstraction.Questions;

public class Exmple2 {

    public static void main(String[] args) {


    }



}

abstract class Shape{

    abstract void area();

    static void f(){    // static method.

        System.out.println("F1");
    }
}

class Sq extends Shape{

    @Override
    void area() {
        System.out.println("area ");


        Shape.f();  // static method we can call anytime.
    }
}