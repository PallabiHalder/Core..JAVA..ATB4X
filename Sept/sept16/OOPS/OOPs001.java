package Sept.sept16.OOPS;

public class OOPs001 {

    public static void main(String[] args) {

     Person p = new Person();   //object 1

     p.name= "Pallabi";

     p.age=29;


     Person p2= new Person();  //object 2

     p2.name="Kuchi";


     Person p3 = new Person();  // object 3


        System.out.println(p);

        System.out.println(p2);

        System.out.println(p3);

        System.out.println(new Person());

        System.out.println(p.name);

        System.out.println(p2.name);

        System.out.println(p3.name); // null : as value not assiogned , it will take default value.

    }
}
