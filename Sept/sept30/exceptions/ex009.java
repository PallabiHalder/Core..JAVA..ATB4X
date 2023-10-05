package Sept.sept30.exceptions;

public class ex009 {

    public static void main(String[] args) {


        // q1


        try {
            int a = 10 / 10;
        } catch (Exception a) {
            System.out.println("I am Catch 01");
        } finally {
            System.out.println("Finally 01");
        }


        System.out.println("-------------------");

        // q2


        try {
            int a = 10 / 0;
        } catch (Exception a) {
            System.out.println("I am Catch 02");
        } finally {
            System.out.println("Finally 02");
        }

        System.out.println("---------------------");

        // q3

        try {
            int a = 10 / 0;
        } catch (Exception a) {
            System.out.println("I am Catch 03");

            System.exit(-1);

        } finally {
            System.out.println("Finally 03");
        }



    }
}
