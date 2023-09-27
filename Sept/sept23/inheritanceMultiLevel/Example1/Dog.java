package Sept.sept23.inheritanceMultiLevel.Example1;

public class Dog extends Animal {

    void bark(){

        System.out.println("I can bark from dog");
    }
   @Override
    void eat(){

       System.out.println("I can eat from dog");

   }

   void sleep(){

       System.out.println("I can sleep from dog");
   }

}
