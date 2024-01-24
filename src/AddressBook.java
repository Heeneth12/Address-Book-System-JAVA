//uc1
//Ability to create a Contacts in Address Book

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
        System.out.println("Enter the E mail ID : ");
        String mail = scanner.nextLine();

        ContactAddress obj = new ContactAddress(FName, LName, Add, city, pin, num, mail);

        System.out.println(obj.FirstName);
        System.out.println(obj.PhoneNum);

    }

}
