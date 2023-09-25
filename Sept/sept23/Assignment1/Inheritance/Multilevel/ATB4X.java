package Sept.sept23.Assignment1.Inheritance.Multilevel;

public class ATB4X extends MyCourse {


    void liveClass(){

        System.out.println("liveClass");

    }


    void manualAPI(){

        System.out.println("manualAPI");

    }

    @Override
    void masterClasses() {

        System.out.println("masterClasses from ATB4X");
    }


    @Override
    void ATB0X() {

        System.out.println("ATB0X from ATB4X");
    }


    @Override
    void community() {

        System.out.println("coummunity from ATB4X");
    }

    @Override
    void support() {

        System.out.println("Support from ATB4X");
    }
}
