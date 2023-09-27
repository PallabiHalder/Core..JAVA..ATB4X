package Sept.sept23Practice.Abstraction.Questions;

public class Abs001 {

    public static void main(String[] args) {


      //  GF gf = new GF() ; // Not Possible as abstract

     //   F f = new F() ; // Not Possible  as abstract

        Son s = new Son() ; // Possible as concrete class

        s.loan() ;

        GF gf2 = new Son(); // valid

        F f2 = new Son() ; //valid


    }


}

abstract class GF {


    abstract void loan();
}

abstract class  F extends GF{


}

class Son extends F {


    @Override
    void loan() {

        System.out.println("I will pay loan");
    }
}