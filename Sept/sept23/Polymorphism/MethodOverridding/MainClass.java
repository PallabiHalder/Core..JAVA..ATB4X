package Sept.sept23.Polymorphism.MethodOverridding;

public class MainClass {

    public static void main(String[] args) {


        Dog d =  new Dog() ;

        d.bark();

        Dog d2 = new Hound();

        d2.bark();


    }


}


// Same Method name and same parameter -> Method Overridding.

// Method Overridding -> Called as Runtime Polymorphism.