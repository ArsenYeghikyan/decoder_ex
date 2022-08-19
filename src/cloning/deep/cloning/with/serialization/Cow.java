package cloning.deep.cloning.with.serialization;

import java.io.*;

public class Cow implements Serializable {
    private String name;
    private int age;
    private int weight;

    public Cow() {

    }




    public Cow(String name, int age, int head) {
        this.name = name;
        this.age = age;
        this.weight = head;
    }


    public static Cow cloningWithSerial(Cow originalCow){
Cow cow = new Cow();

File file = new File("C:\\Users\\User\\Desktop\\decoder_ex\\src\\cloning\\deep\\cloning\\with\\serialization\\cow.txt");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));){


           objectOutputStream.writeObject(originalCow);

           cow = (Cow) objectInputStream.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }



return cow;



    }



    @Override
    public String toString() {
        return "Cow: " +
                "\nname: " + name + '\'' +
                "\nage: " + age +
                "\nweight: " + weight;
    }
}
