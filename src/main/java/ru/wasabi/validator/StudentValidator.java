package ru.wasabi.validator;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.AnswerStudent;
import ru.wasabi.StudentOrder;

@Slf4j
public class StudentValidator {

    public static AnswerStudent checkStudent(StudentOrder studentOrder) {
        log.info("Student check is running");
        AnswerStudent answer = new AnswerStudent();
        return answer;
    }
}
