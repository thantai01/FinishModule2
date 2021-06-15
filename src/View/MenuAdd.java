package View;

import Model.Group;
import Model.PhoneContact;
import Service.ContactManager;
import Service.GroupManager;

import java.util.Scanner;

public class MenuAdd {
    static Scanner sc = new Scanner(System.in);
    static GroupManager phone = new GroupManager();
    static ContactManager contactManager = new ContactManager();

    public static void add() {
        System.out.println("----- ADD MENU -----");
        System.out.println("Choose your next action: ");
        System.out.println("1. Add new group. ");
        System.out.println("2. Add new contact. ");
        System.out.println("_____________________________");
    }
    public static void addAction (GroupManager phone) {
        int action = sc.nextInt();
        switch (action) {
            case 1: phone.add(addNewGroup());break;
            case 2:
                System.out.println("Enter a Group Name to Add Contact");
                String groupName = sc.nextLine();
                for(Group group: phone.getGroupManager()) {
                    if(groupName.equals(group.getName()))
                        group.getContactList().add(addNewContact());
                        contactManager.add(addNewContact());
                }
                System.out.println("New contact added");
                break;
            case 3: MainMenu.mainMenu();
        }
    }

    public static Group addNewGroup() {
        Group group = new Group();
        sc.nextLine();
        System.out.print("Enter a Group Name:");
        String groupName = sc.nextLine();
        group.setName(groupName);
        phone.add(group);
        System.out.println("New Group created");
        System.out.println("-----------------");
        return group;
    }

    public static PhoneContact addNewContact() {
        PhoneContact contact = new PhoneContact();
        System.out.println("Enter a Group Name");
        String groupName= sc.nextLine();
        System.out.println("Enter Phone Number:");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter Person Name:");
        String personName = sc.nextLine();
        System.out.println("Enter Person Gender:");
        String personGender= sc.nextLine();
        System.out.println("Enter Person DOB:");
        String personDOB= sc.nextLine();
        System.out.println("Enter Person Email");
        String personEmail = sc.nextLine();
        System.out.println("Enter Person Address");
        String personAdd = sc.nextLine();
        contact = new PhoneContact(groupName,personName,personGender,personAdd,personDOB, personEmail,phoneNumber);
        contactManager.add(contact);
        return contact;
    }

}
