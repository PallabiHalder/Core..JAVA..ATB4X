package Sept.sept23.Assignment1.Inheritance.Single;

public class RunnerClass {

    public static void main(String[] args) {


        ATB atb = new ATB();

        atb.courseName();

        atb.courseFee();

        atb.courseDuration();


        System.out.println("----------------------------------");


        StudentLogin sL = new StudentLogin() ;

        sL.goToURL();


    }
}
