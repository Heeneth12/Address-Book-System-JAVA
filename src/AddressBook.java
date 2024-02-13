import java.util.Scanner;

public class AddressBook {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        // created a object of ContactManipulater
        ContactManipulate data = new ContactManipulate();
        data.addNewContact();

        // logic to edit contact data
        System.out.println("If you want to Edit your data enter {yes} then {no}");
        String toEdit = scanner.nextLine();
        if (toEdit.equalsIgnoreCase("yes")) {
            System.out.println("Enter the First name of the contact to edit: ");
            String contactToEdit = scanner.nextLine();
            data.editContact(contactToEdit);

            // Print all contacts in the address bookheene
            System.out.println("All Contacts in the Address Book:");
            data.showContactData();

        } else {
            System.out.println("NO changes done in Contact Data");

        }

        // logic to add new contact data
        System.out.println("If you want to add new contact enter {yes} then {no}");
        String toAdd = scanner.nextLine();
        while (toAdd.equals("yes")) {

            data.addNewContact();
            System.out.println("If you want to add new contact enter {yes} then {no}");
            String loop = scanner.nextLine();

            if (loop.equals("yes")) {
                continue;

            } else {
                break;

            }

        }

        // logic to delete contact data
        System.out.println("If you want yo Delete enter {yes} then {no}");
        String toDelete = scanner.nextLine();
        if (toDelete.equalsIgnoreCase("yes")) {
            data.deleteContact();

        } else {
            System.out.println("No contact is deleted");
        }

        System.out.println("All Contacts in the Address Book:");
        data.showContactData();

    }

}