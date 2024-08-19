package ru.wasabi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.MessageFormat;
import java.time.LocalDate;

import static java.util.Objects.requireNonNull;

@Getter
@Setter
@NoArgsConstructor
public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected String patronymic;
    protected LocalDate dateOfBirth;
    protected Address address;

    public Person(final String firstName, final String lastName, final String patronymic,
                  final LocalDate dateOfBirth) {
        this.firstName = requireNonNull(firstName);
        this.lastName = requireNonNull(lastName);
        this.patronymic = requireNonNull(patronymic);
        this.dateOfBirth = requireNonNull(dateOfBirth);
    }

    @Override
    public String toString() {
        return lastName;
    }
}
