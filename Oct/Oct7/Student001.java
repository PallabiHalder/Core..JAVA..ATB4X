package Oct.Oct7;

public class Student001 {


    private String name ;

    private String age ;

    public Student001(String name, String age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student001{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
