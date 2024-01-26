# Address Book Program

## Introduction
Welcome to the Address Book Program! This Java application allows you to create contacts and store their information in an address book.

## Features
- **Create Contacts:** The program enables you to create contacts with various details, such as first name, last name, address, city, zip code, phone number, and email.
- **Default Email:** The default email for each contact is set to "heeneth123@gmail.com".
- **Display Information:** You can display information about a contact, such as the first name and phone number.

## How to Use
1. **Run the Program:** Execute the `AddressBook.java` file to run the program.
   ```bash
   javac AddressBook.java
   java AddressBook


##Create Contacts:
In the main method, create an instance of the ContactAddress class to represent a contact. Provide the necessary details such as first name, last name, etc.
ContactAddress obj = new ContactAddress("heeneth", "Sai", "Chennai", null, 603203, 123821839);

##Display Information:
Print the desired information about the contact
System.out.println(obj.FirstName);
System.out.println(obj.PhoneNum);
##Version
1.0.0 uc1
