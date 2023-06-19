package arraylist.java;

import java.util.List;
import java.util.ArrayList;

class Contact {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private int zipCode;
    private long contactNo;
    private String email;


    public Contact(String firstName, String lastName, String city, String state, String email, int zipCode, long contactNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.contactNo = contactNo;
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public long getContactNo() {
        return contactNo;
    }

    public String getEmail() {
        return email;
    }
}

class AddressBook {
    private List<Contact> contactInfo;

    public AddressBook() {
        this.contactInfo = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contactInfo.add(contact);
    }

    public void removeContact(Contact contact) {
        contactInfo.remove(contact);
    }

    public void viewContacts() {
        if (contactInfo.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            System.out.println("Contacts in your address book are:");
            for (Contact contacts : contactInfo) {
                System.out.println(contacts.getFirstName() + " " + contacts.getLastName() + " " + contacts.getContactNo());
            }
        }
    }

    public void clearAddressBook() {
        contactInfo.clear();
        System.out.println("Your address book is cleared");
    }

    public static void main(String[] args) {
        Contact contact = new Contact("Girish", "Patil", "Dhule", "Maharashtra", "irishpati1", 425404, 8007363535L);
        Contact contact1 = new Contact("Rushi", "pATIL", "Jalgaon", "Maha", "Rushi@123", 765444, 9876590869L);
        AddressBook obj = new AddressBook();
        obj.addContact(contact);
        obj.addContact(contact1);
        obj.viewContacts();
        obj.clearAddressBook();
    }
}