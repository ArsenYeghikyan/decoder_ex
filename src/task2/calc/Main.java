package task2.calc;

import task2.anotacion.Calc;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
Calculator calculator = new Calculator();
Class<?> cl = calculator.getClass();

        try {
            Method method = cl.getDeclaredMethod("calculate", int.class, int.class, String.class);
            Calc calc = method.getAnnotation(Calc.class);
            System.out.println(calculator.calculate(calc.num1(), calc.num2(), calc.operation()));


        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }
}
