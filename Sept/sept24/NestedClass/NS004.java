package Sept.sept24.NestedClass;

public class NS004 {

    public static void main(String[] args) {


     //   Inner in = new  Inner() ; // not possible to create inner class object.

        Outer o = new Outer() ;

        o.m1(); // call m1() method.

    }
}

class Outer {


    int a = 40;

    static int b = 60;

    void m1() {

        System.out.println("Outer Class");

              new Inner().m2_secret() ; // call inner class method here.


    }

    class Inner {

        int secret = 90 ;

        void m2_secret(){

            System.out.println("inner class" + secret);
        }
    }
}