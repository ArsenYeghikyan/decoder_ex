package handler;

import annotations.MathAnno;

import java.lang.reflect.Method;

public class Dispatcher {
    public static void main(String[] args) {

        MathHandler mathHandler = new MathHandler();
        Class<?> cl = mathHandler.getClass();

        try {
            Method m = cl.getDeclaredMethod("addTwoNumbers", int.class, int.class);
            MathAnno mathAnno = m.getAnnotation(MathAnno.class);
            mathHandler.addTwoNumbers(mathAnno.num1(),mathAnno.num2());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
