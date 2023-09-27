package Sept.sept23Practice.Assignment1.Inheritance.Multilevel;

public class MyCourse extends TheTestingAcademy {

void masterClasses(){

    System.out.println("MasterClasses");

}



void ATB0X(){

    System.out.println("ATB0X");

}


    @Override
    void community() {

        System.out.println("Community from MyCourse");
    }


    @Override
    void support() {

        System.out.println("Support from MyCourse");
    }

}
