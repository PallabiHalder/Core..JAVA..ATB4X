package Sept.sept24.NestedClass;

public class NS002 {

    public static void main(String[] args) {


        OC oc = new OC() ;

        System.out.println(oc.a);

        System.out.println(oc.b);

      //  SNC snc = new OC.SNC() ; // for inner class it is not allowed.

        OC.SNC  oo = new OC.SNC() ; // can create object like this : outer class followed by inner class.

        oo.show();


        System.out.println(oo.p);

        System.out.println("-----another way-----");

        System.out.println(OC.SNC.p);

    }
}

 class OC {

     int a = 60;

     static int b = 80;


     static class SNC {

         static int p = 30;

         void show() {

             System.out.println("show");

         }

     }

 }


