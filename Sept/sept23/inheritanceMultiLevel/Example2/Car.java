package Sept.sept23.inheritanceMultiLevel.Example2;

public class Car extends Vehicle{

    public Car (int i){

        super(i) ;

        super.topSpeed();
    }

    void carFunction(){

        System.out.println("Car");



    }
}
