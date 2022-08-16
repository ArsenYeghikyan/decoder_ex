package task5;

import task4.Car;
import task4.Engine;
import task4.Models;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("C:\\Users\\User\\Desktop\\decoder_ex\\src\\task5\\human.txt");
        Human human = new Human("Arsen",1);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(human);


                human = (Human) objectInputStream.readObject();
                System.out.println(human);
            } catch (Exception e) {
               e.printStackTrace();
            }

        }

}
