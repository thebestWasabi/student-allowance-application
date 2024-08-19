package ru.wasabi;

import ru.wasabi.validator.ChildrenValidator;
import ru.wasabi.validator.CityRegisterValidator;
import ru.wasabi.validator.MailSender;
import ru.wasabi.validator.StudentValidator;
import ru.wasabi.validator.WeddingValidator;
import ru.wasabi.validator.check.impl.FakeCityRegisterChecker;

public class App {

    public static void main(String[] args) {
        StudentOrderChecker studentOrderChecker = new StudentOrderChecker(
                new CityRegisterValidator(new FakeCityRegisterChecker()),
                new WeddingValidator(),
                new ChildrenValidator(),
                new StudentValidator(),
                new MailSender()
        );
        studentOrderChecker.checkAll();
    }
}
