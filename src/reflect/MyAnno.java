package reflect;

import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface MyAnno {
        MyAnno2[] value()default {@MyAnno2(str = "str"),@MyAnno2(str = "gdgdgf")};

}
