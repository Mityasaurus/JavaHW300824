package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>(List.of(
                new Person("Jack", 64, Gender.MALE),
                new Person("Anna", 30, Gender.FEMALE),
                new Person("Tom", 15, Gender.MALE),
                new Person("Olivia", 28, Gender.FEMALE),
                new Person("John", 35, Gender.MALE),
                new Person("Emma", 17, Gender.FEMALE),
                new Person("Michael", 50, Gender.MALE),
                new Person("Sophia", 63, Gender.FEMALE),
                new Person("Robert", 65, Gender.MALE),
                new Person("Isabella", 40, Gender.FEMALE)
        ));

        Stream<Person> workingPersons = persons.stream().filter(p -> {
            return p.getGender() == Gender.FEMALE ? p.getAge() >= 18 && p.getAge() < 60
                    :
                    p.getAge() >= 18 && p.getAge() < 65;
        });

        System.out.println(workingPersons.toList());
    }
}