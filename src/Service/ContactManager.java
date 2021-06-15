package Service;

import Model.Find;
import Model.Manager;
import Model.PhoneContact;

import java.util.ArrayList;
import java.util.List;

public class ContactManager implements Manager<PhoneContact>, Find<PhoneContact> {
    private List<PhoneContact> phoneContactList = null;

    public ContactManager() {
        this.phoneContactList = new ArrayList<>();
    }

    public List<PhoneContact> getPhoneContacts() {
        return phoneContactList;
    }

    public void setPhoneContacts(List<PhoneContact> phoneContacts) {
        this.phoneContactList = phoneContacts;
    }

    @Override
    public String toString() {
        return "ContactManager{" +
                "phoneContactList=" + phoneContactList +
                '}';
    }

    @Override
    public void add(PhoneContact phoneContact) {
        phoneContactList.add(phoneContact);
    }

    @Override
    public void display() {
        System.out.println(phoneContactList);;
    }

    @Override
    public void edit(String phoneNum,PhoneContact contact) {
        int contactIndex = findIndex(phoneNum);
        if(findIndex(phoneNum)==-1) {
            System.out.println("Contact not found");
        } else phoneContactList.set(contactIndex,contact);
    }

    @Override
    public int findIndex(String phoneNum) {
        for (int i = 0; i<phoneContactList.size();i++) {
            if(phoneContactList.get(i).getPhoneNums().equals(phoneNum)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findByPhoneNums(String phoneNums) {
        for(PhoneContact contact: phoneContactList) {
            if(phoneNums.equals(contact.getPhoneNums())) {
                System.out.println(contact + "\n");
            }
        }
    }

    @Override
    public void findByName(String name) {
        for(PhoneContact contact: phoneContactList) {
            if(name.equals(contact.getName())) {
                System.out.println(contact + "\n");
            }
        }
    }
    public void deleteContact(String phoneNumber) {
        for(PhoneContact contact: phoneContactList) {
            if(contact.getPhoneNums().equals(phoneNumber)) {
                phoneContactList.remove(findIndex(phoneNumber));
            }
        }
    }
}
