package Sept.sept24.NestedClass;

public class NS001 {

    public static void main(String[] args) {



     A  a = new A(); // for outer class object can be created.

    // B  b =  new B() ; // for inner class object can't be created.

    }
}


class A{  // outer class

    class B {  //inner class



    }


}

// Nested class have one outer class and one inner class.


// inner class uses for security purpose.