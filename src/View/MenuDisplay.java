package View;

import java.awt.*;
import java.util.Scanner;

public class MenuDisplay {
    static Scanner sc = new Scanner(System.in);


    public static void displayMenu() {
        System.out.println("------ DISPLAY ------");
        System.out.println("1. Display Contact List:");
        System.out.println("2. Display Group List:");
    }
    public static void displayAction() {
        int action = sc.nextInt();
        switch (action) {
            case 1:
                System.out.println(MenuAdd.contactManager);
                break;
            case 2:
                System.out.println(MenuAdd.phone);
        }
    }
}
