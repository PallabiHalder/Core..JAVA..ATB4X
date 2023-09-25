package Sept.sept17;

public class Question2 {

    public static void main(String[] args) {


        Person02 h1=new Person02();

        Person02 h2=new Person02();

        Person02 h3=null;

       h2.run();  //  o/p : Run called

    //   h3.run();   // o/p : NullPointerException

       System.out.println(h1.a+"\t"+h2.a);  // o/p :  0    0

        h1.a =99;

       System.out.println(h1.a+"\t"+h2.a); // o/p :  99  0




    }
}


class Person02 {

    int a;  // Attribute


    void run(){  // method
        System.out.println("Run called");
    }
}