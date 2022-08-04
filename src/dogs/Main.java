package dogs;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        AnotherDog dog = new AnotherDog();
        Class<?> cl = dog.getClass();

        Annotation[] c = cl.getAnnotations();

        System.out.println(dog.getClass().getName() + "\nAnnotations: ");

        for (Annotation annotation : c) {
            System.out.println("\t" + annotation);
        }

        Method[] clM = cl.getMethods();

        System.out.println("Method annotations");

        for (Method m : clM) {
            Annotation[] mAn = m.getAnnotations();
            if (mAn.length > 0) {
                System.out.println("\t" + m.getName() + "()");
            }
        }
    }
}
