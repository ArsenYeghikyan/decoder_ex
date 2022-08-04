package task1;

import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RepMathAnnos {
    MathAnno[] value() default {@MathAnno(num = "100"),@MathAnno(num = "20")};
}
