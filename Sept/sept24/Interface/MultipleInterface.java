package Sept.sept24.Interface;

public class MultipleInterface {

    public static void main(String[] args) {


        C1 c1 = new C1();

        c1. eat();
    }
}

interface BA {

    int a = 30;

   default void eat(){

        System.out.println("eat from BA");
    };

}


interface ABB{

    int b = 50;

   default void eat(){

        System.out.println("eat from ABB");

    };

}


class C1 implements BA, ABB{


    @Override
    public void eat() {

        System.out.println("eat from C1");
    }
}