package view;

import java.util.Scanner;
import util.ClearScreen;

public class MainView {

    public void mainview(){
        
        boolean check = true;

        while(check){
            ClearScreen.clearScreen();
            Scanner sc = new Scanner(System.in);
            int input;

            System.out.println("Chon chuc nang: ");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi toan bo sinh vien");
            System.out.println("3. Tim kiem sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Cap nhat thong tin sinh vien");
            System.out.println("6. Thoat");

            try {
                input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1 -> {
                        AddView addView = new AddView();
                        addView.addview();
                    }
                    
                    case 2 -> {
                        DisplayView displayView = new DisplayView();
                        displayView.displayview();
                    }

                    case 3 -> {
                        FindView findView = new FindView();
                        findView.displayFindOptions();
                    }

                    case 4 -> {
                        DeleteView deleteView = new DeleteView();
                        deleteView.displayDeleteOptions();
                    }

                    case 5 -> {
                        UpdateView updateView = new UpdateView();
                        updateView.displayUpdateOptions();
                    }

                    case 6 -> {
                        System.out.println("Thoat");
                        check = false;
                    }

                    default -> System.out.println("Khong co chuc nang nay");    
                }
            }catch(NumberFormatException e){
                System.out.println("Nhap sai dinh dang, chi duoc nhap so nguyen!");
            }
        }
    }
    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.mainview();
    }   
}
