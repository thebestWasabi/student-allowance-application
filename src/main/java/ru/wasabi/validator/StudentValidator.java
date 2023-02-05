package ru.wasabi.validator;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.answer.AnswerStudent;
import ru.wasabi.domain.StudentOrder;

@Slf4j
public class StudentValidator {

    public AnswerStudent checkStudent(StudentOrder studentOrder) {
        log.info("Student check is running");
        return new AnswerStudent();
    }
}
