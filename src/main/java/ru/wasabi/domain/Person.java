package ru.wasabi.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@FieldDefaults(level = AccessLevel.PROTECTED)
@Getter
@Setter
public class Person {

    String firstName;
    String lastName;
    String patronymic;
    LocalDate dateOfBirth;
    Address address;

    public String getPersonString() {
        return "ФИО: " + firstName + " " + lastName;
    }
}
