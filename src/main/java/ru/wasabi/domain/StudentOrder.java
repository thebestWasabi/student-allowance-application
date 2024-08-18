package ru.wasabi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentOrder {

    private long studentOrderId;
    private Adult husband;
    private Adult wife;
    private Child child;

}
