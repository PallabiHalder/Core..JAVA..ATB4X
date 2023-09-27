package Sept.sept23Practice.Assignment1.MethodOverloading;

public class MainClass {

    public static void main(String[] args) {


        AllCourses  allCourses = new AllCourses() ;

        // Calling methods by object

        new AllCourses().category();

        new AllCourses().category(5);

        new AllCourses().category(8.9);

        new AllCourses().category("API Testing");


        System.out.println("----------------------------------");

        // calling methods by reference

        allCourses.category();

        allCourses.category(4);

        allCourses.category(5.7);

        allCourses.category("Web Automation");


    }
}
