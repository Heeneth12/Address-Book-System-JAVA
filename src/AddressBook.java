//uc2
//Ability to add a new Contact to Address Book

import java.util.Scanner;

class ContactAddress {

    // instant varibles
    String FirstName;
    String LastName;
    String Address;
    String City;
    int Zip;
    int PhoneNum;
    String Email;

    // constructor
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

    @Override
    public String toString() {
        return "ContactAddress [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City="
                + City + ", Zip=" + Zip + ", PhoneNum=" + PhoneNum + ", Email=" + Email + "]";
    }

}

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);

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

        System.out.println(obj);

    }

}
