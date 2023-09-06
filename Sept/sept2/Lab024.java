package Sept.sept2;

public class Lab024 {

    public static void main(String[] args) {

        // by using ternary operator find maximum number b/w 3 numbers


        int a=20, b=40, c=60;

         int  max = c > (a>b ? a:b) ? c : (a>b ? a:b);

        System.out.println("Max number is " + "\n"+ max);
    }
}
