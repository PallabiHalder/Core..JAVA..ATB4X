package Sept.sept30.exceptions;

public class ex002 {

    public static void main(String[] args) {



        try{

            String name = "Pallabi" ;

            name.trim();

           int a = 10/0 ;

           Integer.parseInt("Pallabi");



        }catch(NullPointerException | ArithmeticException e){

            System.out.println("abc");


        }


        System.out.println("End Line");

    }
}
