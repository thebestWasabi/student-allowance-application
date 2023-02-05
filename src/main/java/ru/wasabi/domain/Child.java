package ru.wasabi.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Child extends Person {

    String certificateNumber;
    LocalDate issueDate;
    String issueDepartment;

    public Child(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, lastName, patronymic, dateOfBirth);
    }
}
