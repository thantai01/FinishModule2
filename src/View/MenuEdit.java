package View;

import Model.PhoneContact;
import Service.ContactManager;

import java.awt.*;
import java.util.Scanner;

public class MenuEdit {
    static Scanner sc = new Scanner(System.in);

    public static void editMenu() {
        System.out.println("1. Edit Contact");
        System.out.println("----------------------");
    }
    public static void editAction() {
        int action = sc.nextInt();
        if (action == 1) {
            editContact(MenuAdd.contactManager);
        }
    }
    public static void editContact(ContactManager contactManager) {
        sc.nextLine();
        System.out.println("Enter Phone Number ");
        String phoneNumber = sc.nextLine();
        for(PhoneContact contact1: contactManager.getPhoneContacts()) {
            if(contact1.getPhoneNums().equals(phoneNumber)) {
                contactManager.edit(phoneNumber, MenuAdd.addNewContact());
            }
        }
    }
}
