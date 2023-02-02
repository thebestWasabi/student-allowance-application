package ru.wasabi.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Adult extends Person {

    String passportSeries;
    String passportNumber;
    LocalDate issueDate;
    String issueDepartment;
    String university;
    String studentId;

    @Override
    public String getPersonString() {
        return "ФИО: " + firstName + " " + lastName + "; Серия и номер паспорта: " + passportSeries + " " + passportNumber;
    }
}
