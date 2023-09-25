package Sept.sept17.inheritance;

public class RunnerClass {

    public static void main(String[] args) {


        Java j = new Java();

        j.printInfoJava();

        Programming p = new Programming();

        p.printInformation();

        Programming p2 = new Java(); // parent class can have child new object.

      //  Java j3 = new Programming(); // Reverse Not Possible


        //  WebDriver w = new WebDriver() ; // future example

        // WebDriver w = new ChromeDriver(); // future example





    }

}
