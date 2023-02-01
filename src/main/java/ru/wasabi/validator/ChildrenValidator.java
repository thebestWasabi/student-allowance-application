package ru.wasabi.validator;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.AnswerChildren;
import ru.wasabi.StudentOrder;

@Slf4j
public class ChildrenValidator {

    public static AnswerChildren checkChildren(StudentOrder studentOrder) {
        log.info("Children Check is running");
        AnswerChildren answer = new AnswerChildren();
        return answer;
    }
}
