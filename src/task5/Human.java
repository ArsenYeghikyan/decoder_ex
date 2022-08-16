package task5;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Human implements Externalizable {

    private transient String name;

    private int id;

    public Human() {
    }

    public Human(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Human:" +
                "\nName: " + name +
                "\nID: " + id;

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        name =(String) in.readObject();
    }


}
