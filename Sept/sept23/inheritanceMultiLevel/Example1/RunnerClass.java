package Sept.sept23.inheritanceMultiLevel.Example1;

public class RunnerClass {

    public static void main(String[] args) {


     Animal a = new Animal();

        a.eat();

   Dog d = new Dog();

        d.bark();

        d.eat();

            Animal a3 = new Dog();

            a3.eat();

            Dog d2 = new BullDog();

            d2.bark();

            Animal a4 = new BullDog();

            a4.eat();

            Dog d3 = new BullDog();

            d3.sleep();


         BullDog bd = new BullDog();

          bd.eat();


         /* a.guard(){     -> Not Possible


        }

             */


    }




}