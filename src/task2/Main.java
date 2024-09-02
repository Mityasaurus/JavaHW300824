package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>(List.of(
                new User("Jack1", 23),
                new User("Harry", 31),
                new User("Charlie12", 18),
                new User("Thomas", 32),
                new User("Amelia33", 30),
                new User("Olivia3", 19),
                new User("Emily", 18),
                new User("Sophie", 25)
        ));

        var sorted = users.stream().sorted(Comparator.comparing(User::getName)).toList();
        //
        System.out.println(sorted.stream().filter(p -> p.getName().matches("^[a-zA-Z]+$")).toList());
        //
        System.out.println(sorted.stream().filter(p -> p.getName().matches("^.*\\d+.*$")).count());
        //
        System.out.println(sorted.stream().collect(Collectors.toMap(User::getName, User::getAge)));
    }
}
