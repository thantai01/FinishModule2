package Model;

public class PhoneContact extends Group{
    private String name;
    private String gender;
    private String address;
    private String dob;
    private String email;
    private String phoneNums;

    public PhoneContact(String name, String name1, String gender, String address, String dob, String email, String phoneNums) {
        super(name);
        this.name = name1;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.phoneNums = phoneNums;
    }

    public PhoneContact() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNums() {
        return phoneNums;
    }

    public void setPhoneNums(String phoneNums) {
        this.phoneNums = phoneNums;
    }

    @Override
    public String toString() {
        return super.toString() + "PhoneContact{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", phoneNums='" + phoneNums + '\'' +
                "} ";
    }
}
