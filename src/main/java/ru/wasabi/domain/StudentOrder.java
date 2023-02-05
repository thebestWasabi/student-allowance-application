package ru.wasabi.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class StudentOrder {

    long studentOrderId;
    Adult husband;
    Adult wife;
    Child child;

}
