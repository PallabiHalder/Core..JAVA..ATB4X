package Sept.sept23Practice.inheritanceMultiLevel.Example1;

public class BullDog extends Dog {

    void guard(){

        System.out.println("I can guard from bulldog");


    }
    @Override
    void bark(){

        System.out.println("I can bark from bulldog");
    }

    @Override
    void eat(){

        System.out.println("I can eat from BullDog");

    }
}
