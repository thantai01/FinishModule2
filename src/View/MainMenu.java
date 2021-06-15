package View;

import Service.GroupManager;

import java.util.Scanner;

public class MainMenu {
    static Scanner sc = new Scanner(System.in);
    GroupManager phone = MenuAdd.phone;

    public static void intro() {
        System.out.println("----- CONTACT MANAGER PROGRAM -----");
        System.out.println("----- ----------------------- -----");
    }
    public static void mainMenu() {
        System.out.println("What is your choice: ?");
        System.out.println("1. Display List. ");
        System.out.println("2. Add. ");
        System.out.println("3. Edit.");
        System.out.println("4. Delete.");
        System.out.println("5. Find.");
        System.out.println("6. Read data from FILE");
        System.out.println("7. Write data to FILE");
        System.out.println("8. Exit");
        System.out.println("____________________________________");
    }
    public static void mainAction(GroupManager phone) {
        int actionInput;
        do {
            mainMenu();
            actionInput = sc.nextInt();
            switch (actionInput) {
                case 1:
                    MenuDisplay.displayMenu();
                    MenuDisplay.displayAction();
                    break;
                case 2:
                    MenuAdd.add();
                    MenuAdd.addAction(phone);

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8: System.exit(0); break;

            }
        } while (actionInput > 0 && actionInput<9);
    }


}
