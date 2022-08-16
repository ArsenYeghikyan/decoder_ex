package task4;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\Desktop\\decoder_ex\\src\\task4\\model.txt");
Car car = new Car(Models.BMW,new Engine(2000));
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){

objectOutputStream.writeObject(car);

car = new Car(Models.MERCEDES,new Engine(5000));

car = (Car) objectInputStream.readObject();
            System.out.println(car);




        }catch (Exception exception){

            exception.printStackTrace();
        }



    }


}
