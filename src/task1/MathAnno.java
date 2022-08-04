package task1;

import java.lang.annotation.*;
@Documented
@Repeatable(RepMathAnnos.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MathAnno {
    String num() default "10";
}




