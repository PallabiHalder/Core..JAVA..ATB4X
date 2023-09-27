package Sept.sept24.Interface;



public class interface001 {

    public static void main(String[] args) {


        StandardLogin s1 = new AdminLogin();

        s1. login();

        StandardLogin s2 = new UserLogin() ;

        s2.login();

        StandardLogin s3 = new BuyerLogin();

        s3.login();


         s1.m1();

         s2.m1();

         s3.m1();

        System.out.println("-------------------------");

        AdminLogin a1 = new AdminLogin();

        a1.m1();

        a1.m2();

        a1.m3();


        System.out.println("--------------------");

        System.out.println(s1.a);

        System.out.println(s2.a);

        System.out.println(s3.a);


        System.out.println("----------------------------");

        C c = new C();

        c.p1();

        c.p2();

    }

}


interface StandardLogin {

    int a = 10;// in interface variables should be 'public static and final' in nature.

    //    a=20; // can't change the value as final.

    void login(); // interface should have abstract method in it.


    // in interface we can't have concrete method.
    // but can have default method().
    // Can have multiple default methods.

    default void m1(){

        System.out.println("Default m1");

    }


    default void m2(){

        System.out.println("Default m2");

    }

    default void m3(){

        System.out.println("Default m3");

    }

}




    class AdminLogin implements StandardLogin,A,B{


        @Override
        public void login() {

            System.out.println("Admin Login");
        }

        @Override
        public void p1() {

        }

        @Override
        public void p2() {

        }
    }

    class UserLogin implements StandardLogin, A,B{


        @Override
        public void login() {

            System.out.println("User Login");
        }

        @Override
        public void p1() {

        }

        @Override
        public void p2() {

        }
    }


    class BuyerLogin implements StandardLogin,A,B{


        @Override
        public void login() {

            System.out.println("buyer login");
        }

        @Override
        public void p1() {

        }

        @Override
        public void p2() {

        }
    }


interface A{

    void p1();
};

interface B{


    void p1();
    void p2();

} ;


class C implements A,B {

    @Override
    public void p1() {

        System.out.println("p1 : solved diamond problem");

    }


    @Override
    public void p2() {

        System.out.println("p2 : solved diamond problem");

    }
}

// ** Multiple inheritance can be supported by interface **

// for class, use 'extends'.

//for interface , use 'implements'.