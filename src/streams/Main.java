package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = getPeople();

        List<Person> female = personList.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .sorted(Comparator.comparing(Person::getName).reversed())
                .toList();
        female.forEach(System.out::println);
        System.out.println();

        List<Person> male = personList.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .sorted(Comparator.comparing(Person::getAge))
                .toList();
        male.forEach(System.out::println);

        System.out.println();

        List<Person> sort = personList.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getGender))
                .toList();
        sort.forEach(System.out::println);

        boolean allMatch = personList.stream().allMatch(person -> person.getAge() > 19);
        System.out.println(allMatch);

        boolean anyMatch = personList.stream().anyMatch(person -> person.getAge() > 7);
        System.out.println(anyMatch);

        boolean noneMatch = personList.stream().noneMatch(person -> person.getName().equals("Favour"));
        System.out.println(noneMatch);

        personList.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        personList.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);


        Map<Gender, List<Person>> list = personList.stream()
                                                .collect(Collectors.groupingBy(Person::getGender));
        list.forEach((gender, people) -> {
            System.out.println(gender);
            people.forEach(System.out::println);
            System.out.println();
        });

        personList.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .ifPresent(System.out::println);
    }


    private static List<Person> getPeople() {
        return List.of(
                new Person("Amaka", 12, Gender.FEMALE),
                new Person("Yemisi", 10, Gender.FEMALE),
                new Person("Ademola", 17, Gender.MALE),
                new Person("Adebisi", 15, Gender.FEMALE),
                new Person("James", 18, Gender.MALE)
        );
    }


}
