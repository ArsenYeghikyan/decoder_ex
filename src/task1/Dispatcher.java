package task1;

import java.lang.reflect.Method;

public class Dispatcher {


    public static void main(String[] args) {

        MathHandler mathHandler = new MathHandler();
        Class<?> aClass = mathHandler.getClass();
        try {
            Method  method = aClass.getDeclaredMethod("mathSum", String.class, String.class);
            RepMathAnnos mathAnno = method.getAnnotation(RepMathAnnos.class);

            mathHandler.mathSum(mathAnno.value()[0].num(),mathAnno.value()[1].num());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }



    }



}
