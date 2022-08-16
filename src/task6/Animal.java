package task6;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Animal implements Externalizable {

    private transient String breed;
    private int age;
    private int weight;

    public Animal() {
    }

    public Animal(String breed, int age, int weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(breed);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        breed = (String) in.readObject();
        age = in.readInt();
    }


    @Override
    public String toString() {
        return "Animal:" +
                "\nbreed: " + breed +
                "\nage: " + age +
                "\nweight: " + weight;
    }
}
