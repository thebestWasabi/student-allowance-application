package ru.wasabi.validator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import ru.wasabi.answer.AnswerCityRegister;
import ru.wasabi.domain.StudentOrder;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
@Getter
@Setter
public class CityRegisterValidator {

    String hostName;

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        log.info("CityRegister check is running: {}", hostName);
        AnswerCityRegister answer = new AnswerCityRegister();
        answer.setSuccess(false);
        return answer;
    }
}
