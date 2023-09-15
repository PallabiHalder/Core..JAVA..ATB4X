package Sept.sept9.string;

public class string002 {

    public static void main(String[] args) {


        String s1= "Pallabi";

        String s2 = new String("Pallabi");

        String s3 = "Pallabi";

        String s4= "Pallabi";

        String s5= new String("Pallabi");


    //  Total  3 String , 5 reference

        // Pallabi  - String Pool - s1, s3, s4 ( s1, s3 ) - Ref

        // Pallabi - Heap Area - s2,  s5  ( s2 not eq s5)

        String s6 = new String("pallabi");

        String s7 = "pallabi";

        System.out.println(s1.contains("a"));

        System.out.println(s1.indexOf("b"));

        System.out.println(s1.length());


        String s10 = "Pallabi@Halder";

        System.out.println(s10.split("@")[0]);

        System.out.println(s10.split("@")[1]);


    }
}
