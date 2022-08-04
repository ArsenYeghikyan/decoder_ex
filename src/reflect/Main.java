package reflect;

import task1.MathAnno;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Main {


//    @Documented
//    @Retention(RetentionPolicy.RUNTIME)
//    @Target({ElementType.METHOD, ElementType.FIELD})
//    @interface MyAnnom {
//        MyAnno2[] value();
//
//        int i() default 10;
//
//    }

    public static void main(String[] args) throws NoSuchMethodException {


        DispHandler d = new DispHandler();

        Class<?> aClass = d.getClass();
        Method method = aClass.getDeclaredMethod("printInfo", String.class, String.class);

        MyAnno2 myAnno = method.getAnnotation(MyAnno2.class);
//        d.printInfo(myAnno.,myAnno.value()[1].str());

    }



}

//@FunctionalInterface //jdk8
//interface MyOwnInterface {
//
//
//    String i2();
//

//}













