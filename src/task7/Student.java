package task7;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

    private String name;
    private int age;
    private Marks marks;

    public Student() {
    }

    public Student(String name, int age, Marks marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age);
        out.writeObject(marks);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
age = in.readInt();
marks = (Marks) in.readObject();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
