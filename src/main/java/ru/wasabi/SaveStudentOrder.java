package ru.wasabi;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.setHusbandFirstName("Пётр");
        studentOrder.setHusbandLastName("Ветров");
        studentOrder.setWifeFirstName("Карина");
        studentOrder.setWifeLastName("Ветрова");

        long answer = saveStudentOrder(studentOrder);
        log.info("Ответ: {}", answer);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        log.info("saveStudentOrder: {}", studentOrder.getHusbandLastName());
        return answer;
    }
}
