package HomeWorkAnnotations.Task1;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
public @interface Dates {
    Date[] value();
}
