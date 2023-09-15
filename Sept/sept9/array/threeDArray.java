package Sept.sept9.array;

public class threeDArray {

    public static void main(String[] args) {


        int[] [] [] threeDArray = new int[2] [3] [4] ;

      //  x -> length : 2 , index : 0,1

      //  y -> length : 3 ,  index : 0,1,2

      // z -> length : 4 , index : 0,1,2,3


        for (int i = 0; i <2 ; i++) {

            for (int j = 0; j <3 ; j++) {

                for (int k = 0; k <4 ; k++) {

                    System.out.print(threeDArray[i][j][k]+ " ");

                }

            }

        }
    }
}
