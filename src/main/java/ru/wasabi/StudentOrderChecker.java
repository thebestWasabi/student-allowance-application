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

    private final CityRegisterValidator cityRegisterValidator;
    private final WeddingValidator weddingValidator;
    private final ChildrenValidator childrenValidator;
    private final StudentValidator studentValidator;
    private final MailSender mailSender;

    public StudentOrderChecker() {
        this.cityRegisterValidator = new CityRegisterValidator();
        this.weddingValidator = new WeddingValidator();
        this.childrenValidator = new ChildrenValidator();
        this.studentValidator = new StudentValidator();
        this.mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderChecker studentOrderChecker = new StudentOrderChecker();
        studentOrderChecker.checkAll();
    }

    public void checkAll() {
        StudentOrder[] studentOrderArray = readStudentOrder();
        for (StudentOrder studentOrder : studentOrderArray) {
            checkOneOrder(studentOrder);
        }
    }

    private StudentOrder[] readStudentOrder() {
        StudentOrder[] studentOrderArray = new StudentOrder[3];
        for (int i = 0; i < studentOrderArray.length; i++) {
            studentOrderArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }
        return studentOrderArray;
    }

    public void checkOneOrder(StudentOrder studentOrder) {
        AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
        AnswerWedding answerWedding = checkWedding(studentOrder);
        AnswerChildren answerChildren = checkChildren(studentOrder);
        AnswerStudent answerStudent = checkStudent(studentOrder);
        sendMail();
    }

    private AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        return cityRegisterValidator.checkCityRegister(studentOrder);
    }

    private AnswerWedding checkWedding(StudentOrder studentOrder) {
        return weddingValidator.checkWedding(studentOrder);
    }

    private AnswerChildren checkChildren(StudentOrder studentOrder) {
        return childrenValidator.checkChildren(studentOrder);
    }

    private AnswerStudent checkStudent(StudentOrder studentOrder) {
        return studentValidator.checkStudent(studentOrder);
    }

    private void sendMail() {
        mailSender.sendMail();
    }
}
