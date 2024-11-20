package util;

import controller.StudentController;
import modal.Student;

public class Validator {

    static StudentController studentController = new StudentController();

    public static boolean validateIDNum(String idNum){
        return idNum.matches("^[a-zA-Z0-9]+$");
    }

    public static boolean validatePhone(String phone){
        return phone.matches("^0\\d{9}$");
    }

    public static boolean validateEmail(String email){
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public static boolean validateName(String name){
        return name.matches("^[a-zA-Z]+$");
    }

    public static boolean validateIDDuplicate(String idNum){
        Student student = new Student();
        student = studentController.findStudentByIDNum(idNum);
        return student != null;
    }
}