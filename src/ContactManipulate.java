import java.util.Scanner;
import java.util.stream.Stream;

public class ContactManipulate extends DataBase {
    static Scanner scanner = new Scanner(System.in);

    // methode to add Contact Data
    public void addNewContact() {

        System.out.println("Enter the First name (str): ");
        String FName = scanner.nextLine();
        // logic to check no duplicate names
        for (ContactAddress i : UserData) {
            if (FName.equals(i.getFirstName())) {
                System.out.println("first name already exist");

            }
        }

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
        // addressBook.add(obj);
        UserData.add(obj);

        System.out.println("Contact added successfully.");
    }

    // methode to Edit contact data
    public void editContact(String firstName) {
        for (ContactAddress contact : UserData) {
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

    // methode to delete contact
    public void deleteContact() {
        System.out.println("Enter the First name of the contact to delete: ");
        String contactToDelete = scanner.nextLine();

        boolean contactFound = false;
        for (ContactAddress contact : UserData) {
            if (contact.getFirstName().equalsIgnoreCase(contactToDelete)) {
                UserData.remove(contact);
                contactFound = true;
                System.out.println("Contact deleted successfully.");
                break;
            }
        }

        if (!contactFound) {
            System.out.println("Contact not found with the given First name.");
        }

    }

    public void showContactData() {

        for (ContactAddress i : UserData) {
            System.out.println(i);
        }

        // UserData.stream().sorted().forEach(System.out::println);

    }

    // logic to search user by city
    public void searchUser_City() {

        System.out.println("Enter the City name to serach user:");
        String cityName = scanner.nextLine();

        UserData.stream()
                .filter(contact -> contact.getCity().equalsIgnoreCase(cityName))
                .map(ContactAddress::getFirstName) // Extracting only the first names
                .forEach(System.out::println);

    }

    // logic to view all the persona by a city
    public void viewAllPersonaByCity() {
        UserData.stream()
                .map(n -> n.getFirstName() + " " + n.getLastName() + "  --> " + n.getCity())
                .forEach(System.out::println);

    }

    // logic to get number of contact persons
    public void getCount() {
        System.out.println("Enter the City name to serach user:");
        String cityName = scanner.nextLine();

        long count = UserData.stream()
                .filter(contact -> contact.getCity().equalsIgnoreCase(cityName)).count();

        System.out.println("In " + cityName + " there are " + count + " persons ");

    }

}
