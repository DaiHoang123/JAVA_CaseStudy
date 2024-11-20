package controller;

import java.util.ArrayList;
import java.util.List;
import modal.Student;

public class StudentController {
    static List<Student> studentList = new ArrayList<>();

    public void addStudent(String idNum, String name, String phone, String email){
        Student student = new Student(idNum, name, phone, email);
        studentList.add(student);
        System.out.println("Them sinh vien thanh cong!");
    }

    public void addStudent(String idNum, String name, String phone){
        Student student = new Student(idNum, name, phone);
        studentList.add(student);
        System.out.println("Them sinh vien thanh cong!");
    }

    public void addStudent(String idNum, String name){
        Student student = new Student(idNum, name);
        studentList.add(student);
        System.out.println("Them sinh vien thanh cong!");
    }

    public void displayAllStudent(){
        if(studentList.isEmpty()) {
            System.out.println("Danh sach sinh vien trong!");
            return;
        }
        for(Student student: studentList){
            System.out.println(student.toString());
        }
    }

    public Student findStudentByIDNum(String idNum){
        for(Student student: studentList){
            if(student.getIDNum().equalsIgnoreCase(idNum)){
                return student;
            }
        }
        return null;
    }

    public Student findStudentByName(String name){
        for(Student student: studentList){
            if(student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;
    }

    public void deleteStudentByIDNum(String idNum){
        for(Student student: studentList){
            if(student.getIDNum().equalsIgnoreCase(idNum)){
                studentList.remove(student);
            }
        }
    }

    public void deleteStudentByName(String name){
        for(int i = 0; i <= studentList.size() - 1 ; i++){
            if(studentList.get(i).getName().equalsIgnoreCase(name)){
                studentList.remove(i);
            }
        }
    }

    public void updateStudent(String idNum, String name, String phone, String email){
        for(Student student: studentList){
            if(student.getIDNum().equalsIgnoreCase(idNum)){
                student.setName(name);
                student.setPhone(phone);
                student.setEmail(email);
            }
        }
    }
}
