package Sept.sept2;

public class Lab012 {

    public static void main(String[] args) {


        byte b1= 20;
        int a1= b1;          // widening  JVM  - You want to add small bucket to bigger bucket that is fine

        System.out.println(a1);


        int p1= 30;
        byte q1= (byte)p1;   // Narrowing -  Int is big basket ->  small basket- Narrow

        System.out.println(q1);



        int course = 10;

        float gst = 2.18f;

        int total = course+ (int)gst; // casting happens here

        System.out.println(total);   // data loss

    }
}
