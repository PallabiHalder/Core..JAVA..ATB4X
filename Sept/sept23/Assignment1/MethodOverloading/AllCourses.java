package Sept.sept23.Assignment1.MethodOverloading;

public class AllCourses {


    void category(){

        System.out.println("No Argument");

    }

    void category(int i){


        System.out.println(" int" + i);
    }


   void category(double d){

       System.out.println("double" + d);
   }


   void category(String str){


       System.out.println("String" + str);
   }
}
