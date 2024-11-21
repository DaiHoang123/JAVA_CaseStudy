package view;

import java.util.Scanner;
import controller.StudentController;
import util.ClearScreen;
import modal.Student;

public class FindView {
    static StudentController studentController = new StudentController();

    Student student = new Student();

    public void displayFindOptions(){
        Scanner sc = new Scanner(System.in);

        ClearScreen.clearScreen();
        System.out.println("Chon phuong thuc tim kiem: ");
        System.out.println("1. Tim kiem theo ID");
        System.out.println("2. Tim kiem theo ten");
        System.out.println("3. Quay lai");

        try{
            int input = Integer.parseInt(sc.nextLine());
            switch(input){
                case 1 -> findByID();
                case 2 -> findByName();
                case 3 -> {
                    System.out.println();
                    System.out.println("-----------------------------------------");
                    System.out.println();
                    MainView mainView = new MainView();
                    mainView.mainview();
                    System.out.println();
                    System.out.println("-----------------------------------------");
                    System.out.println();
                }
            }
        } catch(NumberFormatException e){
            System.out.println("-----------------------------------------");
            System.out.println("Chi duoc nhap so nguyen!");
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayFindOptions();
        }
    }

    public void findByID(){
        System.out.print("Nhap so ID: ");
        Scanner sc = new Scanner(System.in);
        String inputID = sc.nextLine();
        student = studentController.findStudentByIDNum(inputID);
        if(student != null){
            System.out.println("-----------------------------------------");
            System.out.println(student.toString());
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayFindOptions();
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Khong tim thay sinh vien!");
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayFindOptions();
        }
    }

    public void findByName(){
        System.out.print("Nhap ten: ");
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        student = studentController.findStudentByName(inputName);
        if(student != null){
            System.out.println("-----------------------------------------");
            System.out.println(student.toString());
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayFindOptions();
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Khong tim thay sinh vien!");
            System.out.println("-----------------------------------------");
            System.out.println("Enter de tiep tuc");
            sc.nextLine();
            displayFindOptions();
        }
    }
}
