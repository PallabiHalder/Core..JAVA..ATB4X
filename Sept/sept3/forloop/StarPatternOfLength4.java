package Sept.sept3.forloop;

public class StarPatternOfLength4 {

    public static void main(String[] args) {



        // Star Pattern where length=4


        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
