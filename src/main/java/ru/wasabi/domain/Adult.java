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

    public String getAdultString() {
        return MessageFormat.format("{0}, {1}, {2} {3}",
                firstName, lastName, passportSeries, passportNumber);
    }

    public Adult(String firstname, String lastname,final String passportSeries, final String passportNumber) {
        super(firstname, lastname);
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }
}
