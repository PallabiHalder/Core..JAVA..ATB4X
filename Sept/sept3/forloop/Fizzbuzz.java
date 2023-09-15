package Sept.sept3.forloop;

public class Fizzbuzz {

    public static void main(String[] args) {

     /*
        ✅ FizzBuzz Test:
        Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz"
        instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of
        both 3 and 5, print "FizzBuzz."  */



        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }




    }
}

/*

 Note :  when u execute the code lets say when i = 1, i =2,i = 3 and i =4.........
when i = 15 then if u put fizz or buzz in the first condition then since 15
is also divided by 3 and else if statement will never take the
value which is already satisfied with the previous condition and
 thats why when u try to print fizz buzz which i%3 or i%5 i.e nothing
  but i%15 ==0 it will never able to detect 15 as it is already booked
  by 5 or 3 which is also a factor of 15, Hence you should use fizzbuzz
   in the top to avoid such missouts.

 */