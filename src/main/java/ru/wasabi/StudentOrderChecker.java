package ru.wasabi;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.validator.ChildrenValidator;
import ru.wasabi.validator.CityRegisterValidator;
import ru.wasabi.validator.StudentValidator;
import ru.wasabi.validator.WeddingValidator;

@Slf4j
public class StudentOrderChecker {

    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder studentOrder = readStudentOrder();

        while (true) {
            if (studentOrder == null) {
                log.error("Заявка не найдена");
                break;
            }
            AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
            if (!answerCityRegister.isSuccess()) {
                log.error("В реестре населения запрашиваемый человек не найден");
                break;
            }
            AnswerWedding answerWedding = checkWedding(studentOrder);
            AnswerChildren answerChildren = checkChildren(studentOrder);
            AnswerStudent answerStudent = checkStudent(studentOrder);
            sendMail();
        }
    }

    private static StudentOrder readStudentOrder() {
        return new StudentOrder();
    }

    private static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        CityRegisterValidator cityRegisterValidator = new CityRegisterValidator();
        cityRegisterValidator.setHostName("Host1");
        AnswerCityRegister answerCityRegister1 = cityRegisterValidator.checkCityRegister(studentOrder);
        return answerCityRegister1;
    }


    private static AnswerWedding checkWedding(StudentOrder studentOrder) {
        return WeddingValidator.checkWedding(studentOrder);
    }

    private static AnswerChildren checkChildren(StudentOrder studentOrder) {
        return ChildrenValidator.checkChildren(studentOrder);
    }

    private static AnswerStudent checkStudent(StudentOrder studentOrder) {
       return StudentValidator.checkStudent(studentOrder);
    }

    private static void sendMail() {
        log.info("Почта отправлена");
    }
}
