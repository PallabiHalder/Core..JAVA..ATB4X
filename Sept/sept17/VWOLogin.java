package Sept.sept17;

import java.util.concurrent.BlockingDeque;

public class VWOLogin {

   // Attributes : Instance variable // belongs to instance

    String email;

    String pwd;

    String button ;

    static String title;  // static variable : belongs to class



    VWOLogin(){  // Default Constructor : no parameter
                 // It has same name as class name
                 // It has no return type.
                 // 1 class has only one default constructor

        System.out.println("Hello from default Constructor");
    }

    VWOLogin(String email1, String pwd1){  // 1 class has multiple parameterized constructor

    System.out.println("Hello from parameterized constructor" + email1 + pwd1);

    this.email = email1 ;

    this.pwd = pwd1 ;

    }


    // Behaviour / Methods / Functions

    boolean login(){

        return true;

    }


    void rememberMeClick(){

    int a = 10 ;    // local variable : As can declare within method.
                    // Cannot be accessed outside the method.

    System.out.println(a);

    }

   // IIB : Instance Initialization Block

    {
        System.out.println("Hello! from IIB");
    }

    {

        System.out.println("Hello from IIB2"); // We can have unlimited/ multiple IIBs

    }


    static{

        System.out.println("I am Static Block");

        // it will execute first.
        // it will be first line of the o/p.
        // Database Connection
        // driver.get (open a browser)
        // open a file
        // read a csv or EXCEL
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
