package ru.wasabi.validator;

import ru.wasabi.domain.CityRegisterCheckerResponse;
import ru.wasabi.domain.Person;
import ru.wasabi.exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
