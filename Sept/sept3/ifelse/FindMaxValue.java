package Sept.sept3.ifelse;

public class FindMaxValue {

    public static void main(String[] args) {


      //  Find max value by else if

        int a= 30;

        int b=67;

        int c= 54;

        int max;

        if(a>b && a>c){

            max = a ;
        }

        else if(b>c && b>a){

            max= b;
        }

        else {

            max =c;
        }

        System.out.println(max);

    }
}
