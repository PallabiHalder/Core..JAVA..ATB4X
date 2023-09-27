package Sept.sept23Practice.Abstraction.Questions;

public class abs004 {

    public static void main(String[] args) {


    }
}

abstract class Film{
    String name;
    Film(String fName){  // parent constructor
        this.name = fName;
    }

    {
        System.out.println("IIB");
    }
    void show(){
        System.out.println(this.name);
    }
}

class ChildFilm extends Film{


    ChildFilm(String fName) { // If parent have a constructor, Child can also have a constructor.
        super(fName);
    }
}

