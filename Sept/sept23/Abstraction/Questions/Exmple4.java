package Sept.sept23.Abstraction.Questions;

public class Exmple4 {

    public static void main(String[] args) {

        StaticDemo.m1();  //Static method we can call anytime

        new P30().m2();


    }
}


abstract class StaticDemo{
    int a = 10;
    static void m1(){
        System.out.println("Static");
    }

    void m2(){
        System.out.println("m2");
    }
}

class P30 extends StaticDemo{ // to complete StaticDemo abstract class , we can call a concrete class.

}