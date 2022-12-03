package taks8;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private int socialId;

    public Person(String firstName, String lastName, int age, int socialId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.socialId = socialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && socialId == person.socialId &&
                firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
