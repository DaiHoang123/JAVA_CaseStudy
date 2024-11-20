package view;

import java.util.Scanner;
import controller.StudentController;
import modal.Student;
import util.ClearScreen;

public class DeleteView {

    Scanner sc = new Scanner(System.in);

    static StudentController studentController = new StudentController();

    Student student = new Student();

    public void displayDeleteOptions(){
        

        ClearScreen.clearScreen();
        System.out.println("Chon phuong thuc xoa: ");
        System.out.println("1. Xoa theo ID");
        System.out.println("2. Xoa theo ten");
        System.out.println("3. Quay lai");

        int input = Integer.parseInt(sc.nextLine());
        
        switch(input){
            case 1 -> deleteByID();
            case 2 -> deleteByName();
            case 3 -> {
                System.out.println("-----------------------------------------");
                MainView mainView = new MainView();
                mainView.mainview();
                System.out.println("-----------------------------------------");
            }
        }
    }

    public void deleteByID(){
        System.out.print("Nhap so ID: ");
        String inputID = sc.nextLine();
        student = studentController.findStudentByIDNum(inputID);
        if(student != null){
            System.out.println("-----------------------------------------");
            studentController.deleteStudentByIDNum(inputID);
            System.out.println("Xoa sinh vien thanh cong");
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayDeleteOptions();
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Khong tim thay sinh vien co ID: " + inputID);
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayDeleteOptions();
        }
        System.out.println("Enter de tiep tuc");
        sc.nextLine();
    }
    
    public void deleteByName(){
        System.out.print("Nhap ten: ");
        String inputName = sc.nextLine();
        student = studentController.findStudentByName(inputName);
        if(student != null){
            System.out.println("-----------------------------------------");
            studentController.deleteStudentByName(inputName);
            System.out.println("Xoa sinh vien thanh cong");
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayDeleteOptions();
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Khong tim thay sinh vien co ten la " + inputName);
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayDeleteOptions();
        }
        System.out.println("Enter de tiep tuc");
        sc.nextLine();
    }
}
