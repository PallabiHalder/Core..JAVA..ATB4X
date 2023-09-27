package Sept.sept24.AnonymousClass;

public class An001 {

    public static void main(String[] args) {


        A a = new A() { // annoymous Class object declaration


            @Override
            public void m1() {

                System.out.println("m1");
            }
        } ;

       a.m1();
    }
}

interface A {

    void m1();  // interface can have only abstract method. Concrete method is not allowed here.

}

 /*  class Pallabi implements A {


    @Override
    public void m1() {

        System.out.println("Yes m1");
    }


}


  */

// Anonymous class we will use in thread.