package task7;

import java.io.*;

import static task7.Marks.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Arsen",22,EXCELLENT);

        File f =new File("C:\\Users\\User\\Desktop\\decoder_ex\\src\\task7\\student.txt");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){

            oos.writeObject(student);

          Student s = (Student) ois.readObject();

            System.out.println(s);


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
