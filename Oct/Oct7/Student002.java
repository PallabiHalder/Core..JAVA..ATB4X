package Oct.Oct7;

public class Student002 implements Comparable<Student002> {


    private String name;
    private Integer age;

    private Integer id;


    public Student002(String name, Integer age, Integer id) {


        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {


        return "Student002{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }



/*
    @Override
    public int compareTo(Student002 o) {

        // s1.id - s2.id = 0

        // s1.id > s2.id --> ASC

        //s1.id < s2.id --> DSC

        return this.id - o.id ;



 */


    @Override
    public int compareTo(Student002 o) {
        return this.name.compareTo(o.name);
    }



    }

