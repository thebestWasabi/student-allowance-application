package ru.wasabi.validator;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import ru.wasabi.AnswerCityRegister;
import ru.wasabi.StudentOrder;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class CityRegisterValidator {

    String hostName;

    public static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister check is running");
        AnswerCityRegister answer = new AnswerCityRegister();
        answer.setSuccess(false);
        return answer;
    }
}
