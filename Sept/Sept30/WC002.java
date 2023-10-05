package Sept.Sept30;

public class WC002 {

    public static void main(String[] args) {


     // ** Primitive to String **

        int x = 123 ;


      //  String s1 = x ;

      //  String s1 = (String)x ;

        String s1 = x + "" ; // Not Recommended.

        String s2 = String.valueOf(x) ;  // Recommended.

        String s3 = Integer.toString(x);  // Recommended.

        System.out.println(s2);

        System.out.println(s3);



        double d = 90.87;

        String sd1 = String.valueOf(d) ;

       String sd2 = Double.toString(d);

        System.out.println(sd1);

        System.out.println(sd2);



        // ** String to Primitive **

        String s = "123" ;

        int px = Integer.parseInt(s); // 1 st way

        Integer pxwc = Integer.valueOf(px) ; // 2 nd way


        System.out.println(px);

        System.out.println(pxwc);

    }

}
