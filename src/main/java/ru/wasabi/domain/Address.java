package ru.wasabi.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Address {

    String postCode;
    String street;
    String building;
    String extension;
    String apartment;

}
