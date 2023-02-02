package ru.wasabi.validator;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.answer.AnswerChildren;
import ru.wasabi.domain.StudentOrder;

@Slf4j
public class ChildrenValidator {

    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        log.info("Children Check is running");
        return new AnswerChildren();
    }
}
