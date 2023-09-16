package Sept.sept16.functions;

public class f003 {


    public static void main(String[] args) {


      /* Calculator

      a, b -> a+b

      x ,y -> x-y

     */
        int sum = add(4,6);

        System.out.println(sum);

        int output = substraction(10,7);

        System.out.println(output);


    }

    static int add (int a, int b ){

        return (a+b);

    }


    static int substraction (int x, int y){

        return (x-y);

    }


}
