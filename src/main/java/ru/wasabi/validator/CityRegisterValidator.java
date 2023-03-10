package ru.wasabi.validator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import ru.wasabi.answer.AnswerCityRegister;
import ru.wasabi.domain.CityRegisterCheckerResponse;
import ru.wasabi.domain.StudentOrder;
import ru.wasabi.exception.CityRegisterException;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
@Getter
@Setter
public class CityRegisterValidator {

    CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        this.personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        log.info("CityRegister check is running");
        try {
            CityRegisterCheckerResponse husbandAnswer = personChecker.checkPerson(studentOrder.getHusband());
            CityRegisterCheckerResponse wifeAnswer = personChecker.checkPerson(studentOrder.getWife());
            CityRegisterCheckerResponse childAnswer = personChecker.checkPerson(studentOrder.getChild());
        } catch (CityRegisterException e) {
            e.printStackTrace();
        }
        return new AnswerCityRegister();
    }
}
