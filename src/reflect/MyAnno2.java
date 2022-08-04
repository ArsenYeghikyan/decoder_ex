package reflect;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(MyAnno.class) // Java 8

@interface MyAnno2 {
    String str() default "Hi";
}

