package Sept.Sept30.exceptions;

public class ex010 {

    public static void main(String[] args) {


        Hello h = new Hello();
        h.process();
        System.out.println("Hello");

    }
}


class Hello{

    public  int process(){
        throw new ArithmeticException();

        // Whatever exception will be called by throw, that will get in o/p.
    }
}