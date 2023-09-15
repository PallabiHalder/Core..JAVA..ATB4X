package Sept.sept3.forloop;

public class LeftTraingleStarPattern {

    public static void main(String[] args) {

// Print Left Traingle pattern

        /*

         ***** -> 5
         ****  -> 4
         ***   -> 3
         **    -> 2
         *     -> 1

 */


        int n=5;

        for (int i = n; i>=1; i--) {

            for (int j = 1; j <=i ; j++) {

             //   System.out.print(n);

             //   System.out.print(i);  // print row

                // System.out.print(j);  //print column

                System.out.print("*");

            }
            System.out.println(" ");
        }


    }
}
