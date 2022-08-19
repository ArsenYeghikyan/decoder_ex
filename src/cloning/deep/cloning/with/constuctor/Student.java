package cloning.deep.cloning.with.constuctor;

public class Student {


    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

//copy constuctor
    public Student(Student other){
        this(other.age,other.name);
    }


    @Override
    public String toString() {
        return "Student: " +
                "\nAge: " + age +
                "\nName: " + name;
    }
}
