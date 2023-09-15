package Sept.sept3.forloop;

public class RightAngleStarPattern {

    public static void main(String[] args) {

        /*

         *        -> 1
         * *      -> 2
         * * *    -> 3
         * * * *  -> 4
         * * * * * ->5

         */

        int n=5; // number of row

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=i ; j++) {

                //  System.out.print(i);

                // System.out.print(j);

                System.out.print("*");


            }
            System.out.println(" ");
        }







    }
}
