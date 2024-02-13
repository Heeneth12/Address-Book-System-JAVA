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

            // Print all contacts in the address bookheeneyes
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

        // logic to search user by city name
        System.out.println("If you want to Search enter {yes} then {no}");
        String toSearch = scanner.nextLine();
        if (toSearch.equalsIgnoreCase("yes")) {
            data.searchUser_City();

        } else {
            System.out.println("No Such Option Found!");
        }

        // logic to show all the person by a city
        System.out.println("If you want to see total user with city name (user -> city) {yes} then {no}");
        String toShowAll = scanner.nextLine();

        if (toShowAll.equalsIgnoreCase("yes")) {
            data.viewAllPersonaByCity();

        } else {
            System.out.println("user not want to see any data ");
        }

        // methode to see count of users in per city
        System.out.println("If you want to see count number of user in city enter {yes} then {no}");
        String toSeeCount = scanner.nextLine();

        if (toSeeCount.equalsIgnoreCase("yes")) {
            data.getCount();

        } else {
            System.out.println("user not want to see any data ");
        }

        // methode to delete user data s
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