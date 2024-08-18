package ru.wasabi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.MessageFormat;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected String patronymic;
    protected LocalDate dateOfBirth;
    protected Address address;

    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPersonString() {
        return MessageFormat.format("{0}, {1}}",
                firstName, lastName);
    }

}
