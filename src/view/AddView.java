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

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Them sinh vien");
        System.out.println("-----------------------------------------");

        String idNum = getNewIDNum();
        String name = getNewName();
        String phone = getNewPhone();
        String email = getNewEmail();

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

    public String getNewIDNum() {
        boolean isIdNum = false;
        String idNum = "";
        while(!isIdNum) {
            System.out.println("Nhap ID: ");
            System.out.println("(Nhap chu va so)");
            idNum = sc.nextLine();
            if(idNum.isEmpty()) {
                System.out.println("-----------------------------------------");
                System.out.println("Khong duoc de trong!");
                System.out.println("-----------------------------------------");
            } else if(!Validator.validateIDNum(idNum)){
                System.out.println("-----------------------------------------");
                System.out.println("ID chi gom chu va so! Vui long nhap lai");
                System.out.println("-----------------------------------------");
            } else {
                isIdNum = true;
            }
        }
        return idNum;
    }

    public String getNewEmail() {
        boolean isEmail = false;
        String inputNewEmail = "";
        while(!isEmail){
            System.out.println("Nhap email: ");
            System.out.println("(Email có dang EmailNam@email.com)");
            inputNewEmail = sc.nextLine();
            if(inputNewEmail.isEmpty()) {
                System.out.println("-----------------------------------------");
                System.out.println("Khong duoc de trong!");
                System.out.println("-----------------------------------------");
            } else if(!Validator.validateEmail(inputNewEmail)){
                System.out.println("-----------------------------------------");
                System.out.println("email phai co dinh dang EmailName@email.com! Vui long nhap lai");
                System.out.println("-----------------------------------------");
            } else {
                isEmail = true;
            }
        }
        return inputNewEmail;
    }

    public String getNewPhone() {
        boolean isPhone = false;
        String inputNewPhone = "";
        while(!isPhone){
            System.out.println("Nhap so dien thoai: ");
            System.out.println("(Chi nhap so)");
            inputNewPhone = sc.nextLine();
            if(inputNewPhone.isEmpty()) {
                System.out.println("-----------------------------------------");
                System.out.println("Khong duoc de trong!");
                System.out.println("-----------------------------------------");
            } else if(!Validator.validatePhone(inputNewPhone)){
                System.out.println("-----------------------------------------");
                System.out.println("So dien thoai phai du 10 so, va bat dau bang so 0. Vui long nhap lai");
                System.out.println("-----------------------------------------");
            } else {
                isPhone = true;
            }
        }
        return inputNewPhone;
    }

    public String getNewName() {
        boolean isName = false;
        String inputNewName = "";
        while(!isName){
            System.out.println("Nhap ten: ");
            System.out.println("(Chi nhap chu)");
            inputNewName = sc.nextLine();
            if(inputNewName.isEmpty()) {
                System.out.println("-----------------------------------------");
                System.out.println("Khong duoc de trong!");
                System.out.println("-----------------------------------------");
            } else if(!Validator.validateName(inputNewName)){
                System.out.println("-----------------------------------------");
                System.out.println("Ten chi duoc bao gom chu cai! Vui long nhap lai");
                System.out.println("-----------------------------------------");
            } else {
                isName = true;
            }
        }
        return inputNewName;
    }
}
