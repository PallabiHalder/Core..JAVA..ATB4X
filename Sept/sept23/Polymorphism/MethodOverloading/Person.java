package Sept.sept23.Polymorphism.MethodOverloading;

public class Person {

    void speak(){

        System.out.println("No Argument") ;

    }

    void speak(int i){

        System.out.println("yes int" + i);

    }

     void speak(Double d){

         System.out.println("yes double" + d);

     }

     void speak(String str){

         System.out.println("yes String" + str);

     }
}

// object in different forms -> called Polymorphism.

// Same method name with different arguments -> Called Method Overloading.

// Method Overloading -> Called as Compile Time Polymorphism.