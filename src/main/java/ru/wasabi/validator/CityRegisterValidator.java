package ru.wasabi.validator;

import ru.wasabi.AnswerCityRegister;
import ru.wasabi.StudentOrder;

public class CityRegisterValidator {

    public static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("CityRegister check is running");
        AnswerCityRegister answer = new AnswerCityRegister();
        answer.setSuccess(false);
        return answer;
    }
}
