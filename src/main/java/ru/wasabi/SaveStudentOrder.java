package ru.wasabi;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.domain.Adult;
import ru.wasabi.domain.StudentOrder;

@Slf4j
public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();
        long answer = saveStudentOrder(studentOrder);
        log.info("Номер: {}", answer);
    }

    public static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 101;
        log.info("saveStudentOrder: ");
        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.setStudentOrderId(id);
        return studentOrder;
    }
}
