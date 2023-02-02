package ru.wasabi;

import lombok.extern.slf4j.Slf4j;
import ru.wasabi.domain.Adult;
import ru.wasabi.domain.StudentOrder;

@Slf4j
public class SaveStudentOrder {

    public static void main(String[] args) {
        buildStudentOrder();

        StudentOrder studentOrder = new StudentOrder();
        long answer = saveStudentOrder(studentOrder);
        log.info("Номер: {}", answer);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 101;
        log.info("saveStudentOrder: ");
        return answer;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();

        Adult husband = new Adult();
        husband.setFirstName("Петр");
        husband.setLastName("Ветров");
        husband.setPassportSeries("1234");
        husband.setPassportNumber("56789");
        String personString = husband.getPersonString();
        log.info("{}", personString);
        studentOrder.setHusband(husband);

        Adult wife = new Adult();
        wife.setFirstName("Карина");
        wife.setLastName("Ветрова");
        studentOrder.setWife(wife);


        return studentOrder;
    }
}
