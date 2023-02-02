package ru.wasabi;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.answer.AnswerChildren;
import ru.wasabi.answer.AnswerCityRegister;
import ru.wasabi.answer.AnswerStudent;
import ru.wasabi.answer.AnswerWedding;
import ru.wasabi.domain.*;
import ru.wasabi.validator.*;

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
                log.info("В реестре населения запрашиваемый человек не найден");
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
        CityRegisterValidator validator = new CityRegisterValidator();
        validator.setHostName("Host1");
        return validator.checkCityRegister(studentOrder);
    }

    private static AnswerWedding checkWedding(StudentOrder studentOrder) {
        WeddingValidator validator = new WeddingValidator();
        return validator.checkWedding(studentOrder);
    }

    private static AnswerChildren checkChildren(StudentOrder studentOrder) {
        ChildrenValidator validator = new ChildrenValidator();
        return validator.checkChildren(studentOrder);
    }

    private static AnswerStudent checkStudent(StudentOrder studentOrder) {
        StudentValidator validator = new StudentValidator();
        return validator.checkStudent(studentOrder);
    }

    private static void sendMail() {
        MailSender.sendMail();
    }
}
