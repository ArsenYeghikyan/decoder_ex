package cloning.shallow.cloning;

public class ShallowCloning {
    public static void main(String[] args) {

        Group group = new Group(1);
        Student student = new Student("Arsen",34,group);

        try {
            Student cloneStudent =(Student) student.clone();

            System.out.println(student);

            cloneStudent.name="rob";
            cloneStudent.group.id=5;
            System.out.println("===================================");
            System.out.println(" after c"+student);
            System.out.println(" after c"+cloneStudent);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
