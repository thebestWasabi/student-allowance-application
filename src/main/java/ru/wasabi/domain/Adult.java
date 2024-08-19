package ru.wasabi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.MessageFormat;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Adult extends Person {

    private String passportSeries;
    private String passportNumber;
    private LocalDate dateIssuePassport;
    private String issueDepartment;
    private String university;
    private String studentId;

    public Adult(String firstName, String lastName, String patronymic, LocalDate dateOfBirth,
                 String passportSeries, String passportNumber, LocalDate dateIssuePassport, String issueDepartment,
                 String university, String studentId) {

        super(firstName, lastName, patronymic, dateOfBirth);
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.dateIssuePassport = dateIssuePassport;
        this.issueDepartment = issueDepartment;
        this.university = university;
        this.studentId = studentId;
    }

    public Adult(String firstName, String lastName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, lastName, patronymic, dateOfBirth);
    }

    public String getAdultString() {
        return MessageFormat.format("{0}, {1}, {2} {3}",
                firstName, lastName, passportSeries, passportNumber);
    }
}
