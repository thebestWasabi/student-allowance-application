package ru.wasabi;

import ru.wasabi.validator.CityRegisterValidator;

import static ru.wasabi.validator.CityRegisterValidator.checkCityRegister;

public class StudentOrderValidator {

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

    public static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        return CityRegisterValidator.checkCityRegister(studentOrder);
    }


    private static AnswerWedding checkWedding(StudentOrder studentOrder) {
        System.out.println("Wedding check is running");
        AnswerWedding answer = new AnswerWedding();
        return answer;
    }

    private static AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("Children Check is running");
        AnswerChildren answer = new AnswerChildren();
        return answer;
    }

    private static AnswerStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("Student check is running");
        AnswerStudent answer = new AnswerStudent();
        return answer;
    }

    private static void sendMail(StudentOrder studentOrder) {
        System.out.println("The email has been sent");
    }
}
