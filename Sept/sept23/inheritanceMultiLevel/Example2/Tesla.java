package Sept.sept23.inheritanceMultiLevel.Example2;

public class Tesla extends Car{


    public Tesla(int i) {
        super(i);  // super -> Car here

        super.carFunction();
    }

   void topSpeed (){

       System.out.println("I am Tesla");
   }

}



