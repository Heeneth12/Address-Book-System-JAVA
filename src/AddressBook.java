import java.util.ArrayList;
import java.util.Scanner;

class ContactAddress {
    String FirstName;
    String LastName;
    String Address;
    String City;
    int Zip;
    int PhoneNum;
    String Email;

    public ContactAddress(String firstname, String LastName, String address, String city, int pins, int nums,
            String mail) {
        this.FirstName = firstname;
        this.LastName = LastName;
        this.Address = address;
        this.City = city;
        this.Zip = pins;
        this.PhoneNum = nums;
        this.Email = mail;
    }

    // Getter methods for accessing private fields
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public int getZip() {
        return Zip;
    }

    public int getPhoneNum() {
        return PhoneNum;
    }

    public String getEmail() {
        return Email;
    }

    // Setter methods for modifying private fields
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setZip(int zip) {
        Zip = zip;
    }

    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "ContactAddress [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City="
                + City + ", Zip=" + Zip + ", PhoneNum=" + PhoneNum + ", Email=" + Email + "]";
    }
}

public class AddressBook {
    private static ArrayList<ContactAddress> addressBook = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        // Example usage to add a new contact
        addNewContact();

        System.out.println("If you want to Edit your data enter {yes} then {no}");
        String toEdit = scanner.nextLine();

        if (toEdit.equalsIgnoreCase("yes")) {
            System.out.println("Enter the First name of the contact to edit: ");
            String contactToEdit = scanner.nextLine();
            editContact(contactToEdit);

            // Print all contacts in the address bookheene
            System.out.println("All Contacts in the Address Book:");
            for (ContactAddress contact : addressBook) {
                System.out.println(contact);
            }

        } else {
            System.out.println("NO changes done in Contact Data");

        }

    }

    private static void addNewContact() {
        System.out.println("Enter the First name (str): ");
        String FName = scanner.nextLine();

        System.out.println("Enter the Last name (str) : ");
        String LName = scanner.nextLine();

        System.out.println("Enter the address : ");
        String Add = scanner.nextLine();

        System.out.println("Enter the City name : ");
        String city = scanner.nextLine();

        System.out.println("Enter the pin Code : ");
        int pin = scanner.nextInt();

        System.out.println("Enter the Phone number : ");
        int num = scanner.nextInt();
        // Consume the newline character left in the buffer
        scanner.nextLine();

        System.out.println("Enter the E mail ID : ");
        String mail = scanner.nextLine();

        ContactAddress obj = new ContactAddress(FName, LName, Add, city, pin, num, mail);
        addressBook.add(obj);

        System.out.println("Contact added successfully.");
    }

    private static void editContact(String firstName) {
        for (ContactAddress contact : addressBook) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("Editing contact: " + contact);
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the new First name (str): ");
                contact.setFirstName(scanner.nextLine());

                System.out.println("Enter the new Last name (str) : ");
                contact.setLastName(scanner.nextLine());

                System.out.println("Enter the new address : ");
                contact.setAddress(scanner.nextLine());

                System.out.println("Enter the new City name : ");
                contact.setCity(scanner.nextLine());

                System.out.println("Enter the new pin Code : ");
                contact.setZip(scanner.nextInt());

                System.out.println("Enter the new Phone number : ");
                contact.setPhoneNum(scanner.nextInt());

                // Consume the newline character left in the buffer
                scanner.nextLine();

                System.out.println("Enter the new E mail ID : ");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact edited successfully.");
            }
        }
        System.out.println("Contact not found with the given First name.");
    }
}
