package ru.wasabi.validator;

import ru.wasabi.domain.CityRegisterCheckerResponse;
import ru.wasabi.domain.Person;
import ru.wasabi.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException {
        return null;
    }
}
