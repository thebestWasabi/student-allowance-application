package ru.wasabi.validator;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import ru.wasabi.answer.AnswerCityRegister;
import ru.wasabi.domain.CityRegisterCheckerResponse;
import ru.wasabi.domain.StudentOrder;
import ru.wasabi.exception.CityRegisterException;
import ru.wasabi.validator.check.CityRegisterChecker;

@Slf4j
@Getter
@Setter
public class CityRegisterValidator {

    private CityRegisterChecker personChecker;

    public CityRegisterValidator(CityRegisterChecker personChecker) {
        this.personChecker = personChecker;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        log.info("CityRegister check is running");

        try {
            CityRegisterCheckerResponse husbandAnswer = personChecker.checkPerson(studentOrder.getHusband());
            CityRegisterCheckerResponse wifeAnswer = personChecker.checkPerson(studentOrder.getWife());
            CityRegisterCheckerResponse childAnswer = personChecker.checkPerson(studentOrder.getChild());
        }
        catch (CityRegisterException e) {
            log.error("CityRegister error {}, {}", e.getMessage(), e.getStackTrace());
        }

        return new AnswerCityRegister();
    }
}
