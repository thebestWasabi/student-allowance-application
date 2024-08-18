package ru.wasabi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Child extends Person {

    private String certificateNumber;
    private LocalDate dateIssueCertificate;
    private String issueDepartment;

}
