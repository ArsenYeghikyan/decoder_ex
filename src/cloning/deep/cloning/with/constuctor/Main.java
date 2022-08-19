package cloning.deep.cloning.with.constuctor;

public class Main {
    public static void main(String[] args) {


        Student originalStudent = new Student(20,"Alex");
        Student cloneStudent = new Student(originalStudent);



    }
}
