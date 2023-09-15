package Sept.sept3.ifelse;

public class LeapYearChecker {

    public static void main(String[] args) {


// Create a program that determines whether a
        // given year is a leap year.
        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.


        int year = 2024 ;

        // (year%4==0 && year%100 !=0) || year%400==0 -> Logic

        if ((year%4==0 && year%100 !=0) || year%400==0){

            System.out.println("It's a leap-year");
        }

        else {

            System.out.println("Not a leap-year");
        }
    }
}
