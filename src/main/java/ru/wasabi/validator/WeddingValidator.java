package ru.wasabi.validator;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.answer.AnswerWedding;
import ru.wasabi.domain.StudentOrder;

@Slf4j
public class WeddingValidator {

    public AnswerWedding checkWedding(StudentOrder studentOrder) {
        log.info("Wedding check is running");
        return new AnswerWedding();
    }
}
