package Sept.sept23Practice.inheritanceMultiLevel.Example2;

public class Vehicle {

    int seats;

    String engineType ;

    int speed;



    Vehicle (int speed){

        this.speed = speed ;
    }

    void topSpeed(){

        System.out.println("Top Speed" + this.speed + "from vehicle" );
    }
}
