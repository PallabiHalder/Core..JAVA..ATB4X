package Sept.sept23.Abstraction.Example1;

public class MainClass {

    public static void main(String[] args) {


        Dog d = new Dog(); // we can create object only of a complete/ concrete class.

        d.m1();

        d.say();

        d.say2();

        d.bark();

    //   Animal a = new Animal() { // We cannot create a object of an abstract class
                                  // becoz it is not completed.

      Animal a2 = new Dog();

      a2.m1();

      a2.say();

      a2.say2();

    }
}
