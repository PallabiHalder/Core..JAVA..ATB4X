package Sept.sept23.Assignment1.Inheritance.Hierarchical;

public class RunnerClass {

    public static void main(String[] args) {

      MyCourses myCourses = new MyCourses() ;

      myCourses.masterClasses();


        System.out.println("------------------------------");

      ATB0X atb0X = new ATB0X() ;

      atb0X.courseCurriculum();

      atb0X.masterClasses();

        System.out.println("---------------------------------");



        ATB4X atb4X  = new ATB4X()  ;

        atb4X.liveclasses();

        atb4X.masterClasses();


        System.out.println("-----------------------------------");


        MyCourses myCourses1 = new ATB0X() ;

        myCourses1.masterClasses();


    }
}
