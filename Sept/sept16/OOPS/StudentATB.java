package Sept.sept16.OOPS;

public class StudentATB {

        //Attributes

        // All are Instance variables

        String name ;

        String course_name ;

        long Phone_number ;

        String email ;


        byte age ;



  // Behaviour

    void eat(){

        System.out.println("I can eat !!");
    }

 // object class methods


    @Override
    public String toString() {

        System.out.println("I am coming from object class");

        return super.toString();
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
