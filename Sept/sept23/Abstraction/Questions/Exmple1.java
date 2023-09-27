package Sept.sept23.Abstraction.Questions;

public class Exmple1 {


    public static void main(String[] args) {


        AbstractClass001 a = new P(); // dynamic polymorphism

        a.m1(); //dynamic dispatch


    }

}


abstract class AbstractClass001{
    abstract void m1();
}

class P extends AbstractClass001{

    @Override
    void m1() {
        System.out.println("Imp");
    }
}