package Model;

import Service.ContactManager;

public class Group {
    private String name;
    private ContactManager contactList;

    public Group(String name) {
        this.name = name;
        this.contactList = new ContactManager();
    }
    public Group() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ContactManager getContactList() {
        return contactList;
    }

    public void setContactList(ContactManager contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                '}';
    }
}
