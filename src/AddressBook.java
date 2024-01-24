//uc1
//Ability to create a Contacts in Address Book

class ContactAddress {

    // instant varibles
    String FirstName;
    String LastName;
    String Address;
    String City;
    int Zip;
    long PhoneNum;
    String Email;

    // constructor
    public ContactAddress(String firstname, String LastName, String address, String city, int zip, int phonenum) {
        this.FirstName = firstname;
        this.LastName = LastName;
        this.Address = address;
        this.City = city;
        this.Zip = zip;
        this.PhoneNum = phonenum;
        this.Email = "heeneth123@gmail.com";

    }

}

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        ContactAddress obj = new ContactAddress("heeneth", "Sai", "Chennai", null, 603203, 123821839);

        System.out.println(obj.FirstName);
        System.out.println(obj.PhoneNum);

    }

}
