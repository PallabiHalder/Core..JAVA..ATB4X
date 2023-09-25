package Sept.sept17;

public class StaticVariable {

    public static void main(String[] args) {


        SV_1 h=new SV_1();

       System.out.println(h.b); // o/p : 0

         h.b=99;

    System.out.println(h.b); // 99

        System.out.println(SV_02.b); // calling static variable by class name. // 0

       new SV_3().b = 99; //  calling static variable by instance.


      System.out.println(new SV_3().b); // 99


      SV_04 h2 =null;

      System.out.println(h2.b); // 0 : as it will take integer default value


        System.out.println(SV_04.b); // 0



    }
}


class SV_1 {
    static int b;
    int a;
}
class SV_02 {
    static int b;
}

class SV_3 {
    static int b;
}

class SV_04 {
    static int b;
}