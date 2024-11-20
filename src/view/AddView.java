package view;

import java.util.Scanner;
import controller.StudentController;
import util.ClearScreen;
import util.Validator;

public class AddView {
    Scanner sc = new Scanner(System.in);
    static StudentController studentController = new StudentController();

    public void addview(){

        ClearScreen.clearScreen();
        studentController = new StudentController();

        boolean isIdNum = false;
        boolean isName = false;
        boolean isPhone = false;
        boolean isEmail = false;

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Them sinh vien");
        System.out.println("-----------------------------------------");

        String idNum = "";
        String name = "";
        String phone = "";
        String email = "";

        while(!isIdNum){
            System.out.println("Nhap ID: ");
            idNum = sc.nextLine();
            if(!Validator.validateIDNum(idNum)){
                System.out.println("ID chi gom chu va so! Vui long nhap lai");
            } else {
                isIdNum = true;
            }
        }

        while(!isName){
            System.out.println("Nhap ten: ");
            name = sc.nextLine();
            if(!Validator.validateName(name)){
                System.out.println("Ten chi duoc bao gom chu cai! Vui long nhap lai");
            } else {
                isName = true;
            }
        }

        while(!isPhone){
            System.out.println("Nhap so dien thoai: ");
            phone = sc.nextLine();
            if(!Validator.validatePhone(phone)){
                System.out.println("So dien thoai phai du 10 so, va bat dau bang so 0. Vui long nhap lai");
            } else {
                isPhone = true;
            }
        }

        while(!isEmail){
            System.out.println("Nhap email: ");
            email = sc.nextLine();
            if(!Validator.validateEmail(email)){
                System.out.println("email phai co dinh dang EmailName@email.com! Vui long nhap lai");
            } else {
                isEmail = true;
            }
        }

        System.out.println();
        if(Validator.validateIDDuplicate(idNum)) {
            System.out.println("-----------------------------------------");
            System.out.println("ID da ton tai!");
        } else {
            studentController.addStudent(idNum, name, phone, email);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Enter de tiep tuc");
        sc.nextLine();  
    }
}
