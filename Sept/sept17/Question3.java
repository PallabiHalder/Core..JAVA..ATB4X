package Sept.sept17;

public class Question3 {

    public static void main(String[] args) {


        P03 h=null;

     // System.out.println(h.a);  // NullPointer Exception


       P03 h2=new P03();  // need to create object to access instance variables


       System.out.println(h2.a); //  o/p : 0

        System.out.println(new P04().a); // o/p : 0

        new P04().run();  //  o/p : Run

    }
}



class P03 {

    int a;  // instance variable // Attribute
}

class P04 {

    int a;    // instance variable // Attribute



    void run(){    // method

        System.out.println("Run");
    }
}

