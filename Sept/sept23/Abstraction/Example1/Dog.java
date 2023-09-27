package Sept.sept23.Abstraction.Example1;


public class Dog extends Animal {

    void bark() {

        System.out.println("bark");

        m1();  // as m1() is not abstract method, we can call it directly without overridding.

    }


    @Override
    void say() {

        System.out.println("Say");
    }

    @Override
    void say2() {

        System.out.println("Say2");

    }



}
