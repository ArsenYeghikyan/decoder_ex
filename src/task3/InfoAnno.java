package task3;


import java.lang.annotation.*;

@Documented
@Target({ElementType.CONSTRUCTOR,ElementType.METHOD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface InfoAnno {
    String name() default "Name";
    String lastName() default "LastName";


}
