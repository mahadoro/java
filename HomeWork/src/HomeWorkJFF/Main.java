package HomeWorkJFF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Harry", 15),
                new User("Tom", 16),
                new User("David", 19),
                new User("Mariia", 38),
                new User("Rachel", 33),
                new User("Monica", 39),
                new User("Joey", 23),
                new User("Chandler", 22),
                new User("Emma", 31),
                new User("Rose", 18)

        );
        System.out.println("Sorted users under 30 years old: ");

        List<User> sorted = users.stream()
                .filter(user -> user.getAge() < 30)
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
        sorted.stream().forEach(x -> System.out.println(x.getName()));


    }
}
