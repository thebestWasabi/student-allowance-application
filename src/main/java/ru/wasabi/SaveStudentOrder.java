package ru.wasabi;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.domain.Adult;
import ru.wasabi.domain.StudentOrder;

import java.time.LocalDate;
import java.time.Month;

@Slf4j
public class SaveStudentOrder {

    public static void main(String[] args) {
        final StudentOrder studentOrder = buildStudentOrder(10);

        final long answer = saveStudentOrder(studentOrder);
        log.info("Номер: {}", answer);
        printStudentOrder(studentOrder);
    }

    public static long saveStudentOrder(final StudentOrder studentOrder) {
        final long answer = 101;
        log.info("saveStudentOrder: ");
        return answer;
    }

    public static StudentOrder buildStudentOrder(final long id) {
        final StudentOrder studentOrder = new StudentOrder();
        final Adult husband = new Adult("Петр", "Ветров", "Отчество1", LocalDate.of(1982, Month.FEBRUARY, 22));
        final Adult wife = new Adult("Карина", "Ветрова", "Отчество2", LocalDate.of(1982, Month.FEBRUARY, 22));

        studentOrder.setStudentOrderId(id);
        studentOrder.setHusband(husband);
        studentOrder.setWife(wife);

        return studentOrder;
    }

    static void printStudentOrder(final StudentOrder studentOrder) {
        log.info("{}", studentOrder.getStudentOrderId());
        log.info("{}", studentOrder.getHusband().getAdultString());
        log.info("{}", studentOrder.getWife().getAdultString());
    }
}
