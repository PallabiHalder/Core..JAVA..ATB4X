package Sept.sept16.OOPS;

public class OOP002 {

    public static void main(String[] args) {

/*
        Person p = null ;

        System.out.println(p); // null

        System.out.println(p.name); // NullPointerException : as reference is null here.
                                    // And object has not created.

*/


        Person p2 = new Person(); // object created.

        System.out.println(p2);

        System.out.println(p2.name);//null :  as object created, it will give default value.

        p2.sleep();// I can sleep. // call the method

        p2.eat(); // I can eat. // call the method






    }
}
