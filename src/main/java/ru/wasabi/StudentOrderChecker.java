package ru.wasabi;

import ru.wasabi.validator.ChildrenValidator;
import ru.wasabi.validator.CityRegisterValidator;
import ru.wasabi.validator.StudentValidator;
import ru.wasabi.validator.WeddingValidator;

import java.util.Random;

public class StudentOrderChecker {

    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder studentOrder = readStudentOrder();

        while (true) {
            if (studentOrder == null) {
                System.out.println("Заявка не найдена");
                break;
            }
            AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
            if (!answerCityRegister.isSuccess()) {
                System.out.println("В реестре населения указанный человек не найден");
                continue;
            }
            AnswerWedding answerWedding = checkWedding(studentOrder);
            AnswerChildren answerChildren = checkChildren(studentOrder);
            AnswerStudent answerStudent = checkStudent(studentOrder);
            sendMail(studentOrder);
        }
    }

    private static StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    private static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        return CityRegisterValidator.checkCityRegister(studentOrder);
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

    private static void sendMail(StudentOrder studentOrder) {
        System.out.println("The email has been sent");
    }
}
