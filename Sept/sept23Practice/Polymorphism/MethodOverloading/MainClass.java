package Sept.sept23Practice.Polymorphism.MethodOverloading;

public class MainClass {

    public static void main(String[] args) {


        Person p = new Person() ;

        // Can call method by object

        new Person().speak();

        new Person().speak(50);

        new Person().speak(4.6);

        new Person().speak("Pallabi");



        // Can call method by reference also

        p.speak();

        p.speak(70);

        p.speak("Kuchi");

        p.speak(9.7);

    }
}
