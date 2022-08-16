package task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Struct;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();


        Class<? extends Human> aClass = human.getClass();

        try {
            Constructor<? extends Human> hc = aClass.getConstructor();
            InfoAnno infoAnno = hc.getAnnotation(InfoAnno.class);





           Field fieldName = aClass.getDeclaredField("name");
           Field fieldLastName = aClass.getDeclaredField("lastName");

            fieldName.setAccessible(true);
            fieldName.set(human,"Arman");
            fieldLastName.setAccessible(true);
            fieldLastName.set(human,"Egikyan");


            Method method = aClass.getDeclaredMethod("printInfo", String.class, String.class);


//
            method.setAccessible(true);
            System.out.println(method.getParameterCount());
            System.out.println(method.toString());


        } catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException  e) {
            throw new RuntimeException(e);
        }


    }
}
