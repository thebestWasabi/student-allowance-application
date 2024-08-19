package ru.wasabi;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.answer.AnswerChildren;
import ru.wasabi.answer.AnswerCityRegister;
import ru.wasabi.answer.AnswerStudent;
import ru.wasabi.answer.AnswerWedding;
import ru.wasabi.domain.StudentOrder;
import ru.wasabi.validator.ChildrenValidator;
import ru.wasabi.validator.CityRegisterValidator;
import ru.wasabi.validator.MailSender;
import ru.wasabi.validator.StudentValidator;
import ru.wasabi.validator.WeddingValidator;

import static java.util.Objects.requireNonNull;

@Slf4j
public class StudentOrderChecker {

    private final CityRegisterValidator cityRegisterValidator;
    private final WeddingValidator weddingValidator;
    private final ChildrenValidator childrenValidator;
    private final StudentValidator studentValidator;
    private final MailSender mailSender;

    public StudentOrderChecker(final CityRegisterValidator cityRegisterValidator,
                               final WeddingValidator weddingValidator,
                               final ChildrenValidator childrenValidator,
                               final StudentValidator studentValidator,
                               final MailSender mailSender) {
        this.cityRegisterValidator = requireNonNull(cityRegisterValidator);
        this.weddingValidator = requireNonNull(weddingValidator);
        this.childrenValidator = requireNonNull(childrenValidator);
        this.studentValidator = requireNonNull(studentValidator);
        this.mailSender = requireNonNull(mailSender);
    }

    public void checkAll() {
        final StudentOrder[] studentOrderArray = readStudentOrders();

        for (StudentOrder studentOrder : studentOrderArray) {
            checkOneOrder(studentOrder);
        }
    }

    private StudentOrder[] readStudentOrders() {
        final StudentOrder[] studentOrderArray = new StudentOrder[5];

        for (int i = 0; i < studentOrderArray.length; i++) {
            studentOrderArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }

        return studentOrderArray;
    }

    private void checkOneOrder(final StudentOrder studentOrder) {
        final AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
        final AnswerWedding answerWedding = checkWedding(studentOrder);
        final AnswerChildren answerChildren = checkChildren(studentOrder);
        final AnswerStudent answerStudent = checkStudent(studentOrder);
        sendMail();
    }

    private AnswerCityRegister checkCityRegister(final StudentOrder studentOrder) {
        return cityRegisterValidator.checkCityRegister(studentOrder);
    }

    private AnswerWedding checkWedding(final StudentOrder studentOrder) {
        return weddingValidator.checkWedding(studentOrder);
    }

    private AnswerChildren checkChildren(final StudentOrder studentOrder) {
        return childrenValidator.checkChildren(studentOrder);
    }

    private AnswerStudent checkStudent(final StudentOrder studentOrder) {
        return studentValidator.checkStudent(studentOrder);
    }

    private void sendMail() {
        mailSender.sendMail();
    }
}
