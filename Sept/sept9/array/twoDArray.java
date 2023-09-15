package Sept.sept9.array;

public class twoDArray {

    public static void main(String[] args) {


     //   int []  marks  = {1,2,3};// type 1 : array declaration : value assigned as 1,2,3

    //    int [] marks = new int[3] ; // type 2 : array declaration : value assigned as 0,0,0


        // 2D Array

        int [] [] matrix = {

                {1,2,3},
                {4,5,6},
                {7,8,9}

        };   // 2D Array declaration type 1


     /*   int [] [] matrix2 = new int[3][3];    //  2D Array declaration type 2

        matrix2[0][1]= 1;

        matrix2[0][2]= 2;

        matrix2[0][3]= 3;

        matrix2[1][1]= 4;

        matrix2[1][2]= 5;

        matrix2[1][3]= 6;

        matrix2[2][1]= 7;

        matrix2[2][2]= 8;

        matrix2[2][3]= 9;


      */


        for (int i = 0; i <matrix.length ; i++) {

            for (int j = 0; j <matrix[i].length ; j++) {

                System.out.print(matrix[i][j] +" ");

            }
            System.out.println(" ");
        }

        }



    }

