package Sept.sept3.forloop;

public class PyramidPattern {

    public static void main(String[] args) {

        /*

      ✅ Pyramid pattern in Java

      *    -> 1
     ***   -> 2
    *****   ->3
   *******  ->4
  ********* ->5

  */

        int n = 5;

          for (int i = 1; i <=n ; i++) {

              for (int j = 1; j <=i+2 ; j++) {

                  System.out.print(j);

              }
              System.out.println(" ");

              }
          }
            
        }



