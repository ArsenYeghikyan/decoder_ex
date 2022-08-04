package task2.anotacion;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Calc {

    int num1() default 1;
    int num2() default 1;

String operation() default "+";


}
