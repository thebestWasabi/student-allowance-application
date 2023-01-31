package ru.wasabi;

public class SaveStudentOrder {

    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.setHusbandFirstName("Пётр");
        studentOrder.setHusbandLastName("Ветров");
        studentOrder.setWifeFirstName("Карина");
        studentOrder.setWifeLastName("Ветрова");

        long answer = saveStudentOrder(studentOrder);
        System.out.println(answer);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.getHusbandLastName());
        return answer;
    }
}
