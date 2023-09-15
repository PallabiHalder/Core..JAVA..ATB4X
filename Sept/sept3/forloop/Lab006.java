package Sept.sept3.forloop;

public class Lab006 {

    public static void main(String[] args) {

        // nested for loop / for loop within for loop


        for (int i = 0; i <3 ; i++) {

            System.out.println(i);

            for (int j = 0; j < 4; j++) {

                System.out.println(j);



                // i = 0 , j =0, 1, 2, 3
                // i = 1 , j =0, 1, 2, 3
                // i = 2 , j =0, 1, 2, 3
                // i = 3 , j=? -> It will not execute as i<3


            }

        }
    }
}
