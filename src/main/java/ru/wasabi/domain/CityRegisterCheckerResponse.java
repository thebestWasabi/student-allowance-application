package ru.wasabi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityRegisterCheckerResponse {

    private boolean existing;
    private Boolean temporaryRegistration;

}
