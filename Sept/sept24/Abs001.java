package Sept.sept24;

public class Abs001 {

    public static void main(String[] args) {

      //  P p = new P(); // as P is abstract class, we cannot create a object of abstract class.


    }

}

 abstract class P{


    void m1(){

        System.out.println("Full Function");
    }

   protected  abstract void say();

                          // if there is a abstract method present in a class, that class

                          //   should be a abstract class.

                         // concrete class cannot have a abstract method.

                         // an abstract class cannot be final.

                        // we can use access modifier in abstract method

    P(){

        System.out.println("I am constructor");
    }

     // in abstract class there is no use of have a constructor.

    // as we cannot call it by creating object.



     public abstract class  Q{


     }

     //  we can use access modifier in abstract class
}
