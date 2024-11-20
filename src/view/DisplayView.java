package view;

import java.util.Scanner;
import controller.StudentController;


public class DisplayView {
    static StudentController studentController = new StudentController();

    public void displayview(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        studentController.displayAllStudent();
        System.out.println("-----------------------------------------");
        System.out.println("Enter de tiep tuc");
        sc.nextLine();
    } 
}
