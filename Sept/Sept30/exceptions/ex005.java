package Sept.Sept30.exceptions;

public class ex005 {

    public static void main(String[] args) {


        try {
            String ip = args[0];

            int a = Integer.parseInt(args[0]);

            int b = 10 / a;

            // some body some code where all three exception are not present then calling Parent

        }  catch (NumberFormatException  | ArithmeticException | ArrayIndexOutOfBoundsException e ) {
            e.printStackTrace();
        }

         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
