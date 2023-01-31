package ru.wasabi;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class StudentOrder {

    String husbandFirstName;
    String husbandLastName;
    String wifeFirstName;
    String wifeLastName;

}
