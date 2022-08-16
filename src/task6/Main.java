package task6;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Dog",12,34);

        File f = new File("C:\\Users\\User\\Desktop\\decoder_ex\\src\\task6\\animal.txt");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){


            oos.writeObject(animal);

animal=null;

          animal = (Animal) ois.readObject();
            System.out.println(animal);


        }catch (Exception e){
            e.printStackTrace();
        }


    }



}
