package Sept.sept2;

public class Lab026 {

    public static void main(String[] args) {

        int a= 10;
        int b= a++ + ++a ;


        /*
        a++ = exp = 10 and a= 10 and final a= 11

        + =

        ++a = 12 and exp = 12



         */


        System.out.println(a); // 12 // take expression value

        System.out.println(b); // 22 // sum of expression value
    }
}
