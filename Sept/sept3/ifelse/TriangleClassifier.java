package Sept.sept3.ifelse;

public class TriangleClassifier {

    public static void main(String[] args) {

        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.


        int side1 = 10;

        int side2 = 20;

        int side3 = 20;

        if (side1 == side2 && side2 == side3 && side3 == side1) {

            System.out.println("triangle is equilateral");

        } else if (side1 == side2 || side2 == side3 || side3 == side1) {

            System.out.println("triangle is isosceles ");

        } else {

            System.out.println("triangle is scalene");
        }
    }
}
