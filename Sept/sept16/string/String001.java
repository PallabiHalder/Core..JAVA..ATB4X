package Sept.sept16.string;

public class String001 {

    public static void main(String[] args) {


        String name = "The Testing Academy";  //string pool

        String name1 = "The Testing Academy";  //string pool

        String name2 = new String("the Testing Academy");  // heap area


        System.out.println(name==name1);

        System.out.println(name==name2);

        System.out.println(name.equals(name2));

        System.out.println(name.equalsIgnoreCase(name2));









    }


}
