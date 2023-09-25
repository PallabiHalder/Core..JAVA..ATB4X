package Sept.sept17;

public class RunnerClass {

    public static void main(String[] args) {


        VWOLogin vwoLogin = new VWOLogin("admin@gmail.com", "password@123");  // Call IIB , IIB2 , Default Constructor

        //  vwoLogin.email = "admin@gmail.com" ;

        //  vwoLogin.pwd = "password@123" ;

        System.out.println(vwoLogin.email);

        System.out.println(vwoLogin.pwd);

        System.out.println(vwoLogin.title); // null as value not assigned, it will take default value.

        vwoLogin.title = "VwoLogin";

        System.out.println(vwoLogin.title);

        vwoLogin.title = "AbcApp";

        System.out.println(vwoLogin.title);


        //  new VWOLogin().button = "Yes , Clicked !";


        // Instance Variable can call by only instance/ reference.


        System.out.println("--------------------------------------");


        VWOLogin vwoLogin2 = new VWOLogin("pallabi@gmail.com", "pallabi@123"); //call IIB, IIB2, Parameterized constructor.

        // IIB will be always call , whenever the object is created.

        System.out.println(vwoLogin2.email);

        System.out.println(vwoLogin2.title); /* As title is static variable, it will be same for

                                           all object of same class  and will give updated value */

    }
        }

