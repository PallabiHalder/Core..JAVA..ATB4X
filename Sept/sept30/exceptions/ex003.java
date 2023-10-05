package Sept.sept30.exceptions;

public class ex003 {

    public static void main(String[] args) {

        try {

            String ip = args[0];

            int a = Integer.parseInt(args[0]);  //

           int b = 10 / a;

           System.out.println(a);

           System.out.println(b);

            // some code here which another type of exception
        }
        catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException  e) {

            System.out.println(e.getMessage());
        }

    }
}
