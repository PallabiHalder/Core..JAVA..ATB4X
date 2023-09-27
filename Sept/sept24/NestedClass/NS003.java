package Sept.sept24.NestedClass;

public class NS003 {

    public static void main(String[] args) {

Father f = new Father();

  f.driver2();


  Father.Son   s =   new Father.Son() ;

  s.print();

 // f.car2 ;  // not possible.







    }

}


class Father {

    int a = 10;

    void driver(){

        System.out.println("car");
    }

    void driver2(){

        System.out.println("car2"); // outer class cannot access inner class variables.
    }


   static  class Son{

        String car2 = "Lambo" ;

        void print() {

            System.out.println("car"); // inner class can access all the outer class variable.
        }

    }
}