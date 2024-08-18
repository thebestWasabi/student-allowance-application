package ru.wasabi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String postCode;
    private String street;
    private String building;
    private String extension;
    private String apartment;

}
