package xml.example.task1;

public class People {

    private int age;
    private String name;


    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nPeople: " +
                "\nage: " + age +
                "\nname: " + name;
    }
}
