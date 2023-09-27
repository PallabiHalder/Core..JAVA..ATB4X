package Sept.sept23Practice.Abstraction.Questions;

public class Exmple3 {

    public static void main(String[] args) {


    }
}


abstract class Person1 {

    abstract void sleeping();
    abstract void walking();
}

abstract class Student1 extends Person1 {

    void sleeping() {                  //in abstract class also we can complete abstract methods.
        System.out.println("dadasd");
    }
}
class CurrentStudent extends Student1{

    @Override
    void walking() {
        System.out.println("dadasd");
    }



    }
