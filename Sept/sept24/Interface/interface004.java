package Sept.sept24.Interface;

public class interface004 {

    public static void main(String[] args) {

  normalClass nc = new normalClass();

    nc.sum();

    calculator c = new normalClass();

    c.costheta();

    calculator.sintheta(); // static method can call by interface only.

    }
}


interface calculator {

    void sum();

    void sub();

    void div();  // if I add any normal function, need to implement in all classes.

    default void  costheta(){

        System.out.println("costheta");
    }

    static void sintheta(){

        System.out.println("sintheta");

    }



}


class normalClass implements calculator{


    @Override
    public void sum() {

        int a = 20;

        int b = 30;

        int c = a+b ;

        System.out.println("a+b" + "=" + c );

    }
    @Override
    public void sub() {

    }

    @Override
    public void div() {

    }
}