package Sept.sept24.Interface;

public class interface003 {

    public static void main(String[] args) {

      //  ICanFly i = new ICanFly() { // Not possible to create an object.

        ICanFly i2 = new bird();

        i2.fly();

        i2.eat();

        i2.sleep();

           }
}

interface ICanFly{


    void fly() ; // public static

    default void eat(){

        System.out.println("default eat");
    }

    default void sleep(){

        System.out.println("default sleep");
    }

}


class bird implements ICanFly {

    @Override
    public void fly() {

        System.out.println("I am flying like a bird");
    }
}


//only 2 kind of functionality i.e default and static can have an interface.

// This is newly added.