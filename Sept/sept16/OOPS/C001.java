package Sept.sept16.OOPS;

public class C001 {

    public static void main(String[] args) {

        StudentATB  a = new StudentATB();
         a.name = "Sunny";

         StudentATB  b = new StudentATB();
         b.name = "Ronny" ;

        System.out.println(a); // it will give  address


        System.out.println(b); // it will give  address


        System.out.println(a.toString()); // it will give same address
                                           // by default toString() will give address


        System.out.println(a.hashCode()); // it will give integer value

    }
}
