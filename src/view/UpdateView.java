package view;

import java.util.Scanner;
import controller.StudentController;
import modal.Student;
import util.ClearScreen;

public class UpdateView {
    Scanner sc = new Scanner(System.in);

    static StudentController studentController = new StudentController();

    Student student = new Student();

    public void displayUpdateOptions(){
        ClearScreen.clearScreen();

        System.out.println("Chon phuong thuc cap nhat: ");
        System.out.println("1. Cap nhat theo ID");
        System.out.println("2. Cap nhat theo ten");
        System.out.println("3. Quay lai");

        int input = Integer.parseInt(sc.nextLine());

        switch(input){
            case 1 -> updateByID();
            case 2 -> updateByName();
            case 3 -> {
                MainView mainView = new MainView();
                mainView.mainview();
            }   
        }   
    }

    public void updateByID(){
        System.out.print("Nhap ID: ");
        String inputID = sc.nextLine();
        student = studentController.findStudentByIDNum(inputID);
        if(student != null){
            System.out.println("-----------------------------------------");
            System.out.println("Nhap ten moi: ");
            String inputNewName = sc.nextLine();
            System.out.println("Nhap so dien thoai moi: ");
            String inputNewPhone = sc.nextLine();
            System.out.println("Nhap email moi: ");
            String inputNewEmail = sc.nextLine();
            System.out.println("-----------------------------------------");
            studentController.updateStudent(inputID, inputNewName, inputNewPhone, inputNewEmail);
            System.out.println("Cap nhat thanh cong");
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayUpdateOptions();
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Khong tim thay sinh vien co ID: " + inputID);
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayUpdateOptions();
        }
    }

    public void updateByName(){
        System.out.print("Nhap ten: ");
        String inputName = sc.nextLine();
        student = studentController.findStudentByName(inputName);
        if(student != null){
            System.out.println("-----------------------------------------");
            System.out.println("Nhap ten moi: ");
            String inputNewName = sc.nextLine();
            System.out.println("Nhap so dien thoai moi: ");
            String inputNewPhone = sc.nextLine();
            System.out.println("Nhap email moi: ");
            String inputNewEmail = sc.nextLine();
            System.out.println("-----------------------------------------");
            studentController.updateStudent(student.getIDNum(), inputNewName, inputNewPhone, inputNewEmail);
            System.out.println("Cap nhat thanh cong");
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayUpdateOptions();
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Khong tim thay sinh vien co ten: " + inputName);
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayUpdateOptions();
        }
    }

        public void updateStudent(){
        String idNum = "";
        String name, phone, email;
        System.out.print("Nhap ID: ");
        int inputID = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        phone = sc.nextLine();
        System.out.print("Nhap email: ");
        email = sc.nextLine();

        studentController.updateStudent(idNum, name, phone, email);
    }
}
