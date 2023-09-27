package Sept.sept23.inheritanceHeirarichel.example1;

public class RunnerClass {

    public static void main(String[] args) {

      Animal a = new Animal() ;

        a.eat(); // it's possible because eat() is common function.

      Dog d = new Dog();

        d.eat();

        Cat c = new Cat();

        c.eat();

        c.meow();

        d.bark();

        Animal a2 = new Dog(); // Dog object is created.

        a2.eat(); // so it will call dog's eat() method.

       // a.meow(); // Not possible, because by parent reference we can call only common functions.











    }
}
