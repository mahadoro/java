package HomeWorkAnnotations.Task2;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Class userClass = user.getClass();

        Annotation myAnnotation = userClass.getAnnotation(Writer.class);

        Writer writer = (Writer) myAnnotation;

        user.setFirstName(writer.stringValue());
        user.setLastName(writer.stringValue());
        user.setAge(writer.intValue());

        System.out.println(user.toString());
    }
}
