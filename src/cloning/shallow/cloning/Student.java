package cloning.shallow.cloning;

import java.util.Objects;

public class Student implements Cloneable{

    public String name;
    public int age;
    public Group group;

    public Student() {
    }

    public Student(String name, int age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student: " +
                "\nname: " + name +
                "\nage: " + age +
                "\ngroup: " + group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, group);
    }
}
