package cloning.deep.cloning.with.staticmethod;

import task3.Human;

public class Student {
    private int age;
    private String name;

    public Student() {
    }




    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public static Student getStudentInstanceWithAgeAndName (int age,String name){

        Student instance = new Student();

        instance.age = age;
        instance.name = name;

        return instance;


    }



    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
