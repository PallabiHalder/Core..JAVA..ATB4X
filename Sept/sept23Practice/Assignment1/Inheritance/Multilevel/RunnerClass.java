package Sept.sept23Practice.Assignment1.Inheritance.Multilevel;

public class RunnerClass {

    public static void main(String[] args) {

     TheTestingAcademy tta = new TheTestingAcademy();

       tta.community();

       tta.calender();

       tta.support();

        System.out.println("----------------------------");


        MyCourse myCourse = new MyCourse() ;

        myCourse.masterClasses();

        myCourse.ATB0X();

        myCourse.community();

        myCourse.support();

        System.out.println("---------------------------");


        ATB4X atb4X = new ATB4X() ;

        atb4X.liveClass();

        atb4X.manualAPI();

        atb4X.masterClasses();

        atb4X.ATB0X();

        atb4X.community();

        atb4X.support();


    }
}
