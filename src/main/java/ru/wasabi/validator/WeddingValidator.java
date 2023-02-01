package ru.wasabi.validator;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.AnswerWedding;
import ru.wasabi.StudentOrder;

@Slf4j
public class WeddingValidator {

    public static AnswerWedding checkWedding(StudentOrder studentOrder) {
        log.info("Wedding check is running");
        AnswerWedding answer = new AnswerWedding();
        return answer;
    }
}
