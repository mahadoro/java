package HomeWorkAnnotations.Task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Date {
    Day day();
    int number();
    Month month();
    int year();
    String format();

    enum Day{
       MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    enum Month{
        OCTOBER, NOVEMBER, DECEMBER, JANUARY, FEBRUARY
    }



}
