package com.Bridglabz.AddressBookProject;

import java.util.HashSet;
import java.util.Scanner;
/*
@Desc: AddressBook class is a class which contains Contact info method.
1:addContact Method.
2:updateContact Method.
3:DeleteContact Method.
@Param:Its a taking a object from the user as parameter.

 */

public class AddressBook {
    static boolean isOrdering = true;
    static boolean isOrdering1 = true;
    static boolean ordering = true;

    public static void main(String[] args) {
        AddressBook1 addressBook1 = new AddressBook1();
        AddressBook2 addressBook2 = new AddressBook2();
        Scanner sc = new Scanner(System.in);
        // Do while loop....
        do {
            System.out.println("Multiple  AddressBook..");
            System.out.println("Enter the input to access multiple addressBook..");
            int addressBook = sc.nextInt();
            switch (addressBook) {
                case 1:
                    System.out.println("Print addressBook1:");
                    do {
                        System.out.println("Welcome to AddressBook Project"
                                + "\n1. Add Contact Details"
                                + "\n2. View Contact details"
                                + "\n3.Update Contact details"
                                + "\n4. Delete Contact details"
                                + "\n5. Add multiple Contact in addressBook"
                                + "\n6. Exit ");
                        System.out.println("Enter the choice! :");
                        int choice = sc.nextInt();

                        // Switch Cases..........
                        switch (choice) {
                            //Add contacts...
                            case 1:
                                System.out.println("Add Contacts: ");
                                addressBook1.addContact();
                                break;
                            // View Contact details....
                            case 2:
                                System.out.println("View Contact details....");
                                addressBook1.display();
                                break;
                            // Update Contacts.....
                            case 3:
                                System.out.println("Update Contacts: ");
                                addressBook1.updateContacts();
                                break;
                            // Delete Contacts....
                            case 4:
                                System.out.println("Delete Contacts: ");
                                addressBook1.deleteContacts();
                                break;
                            // Exit from program
                            case 5:
                                System.out.println("Ability to add multiple AddressBook..");
                                addressBook1.addMultipleContacts();
                                break;
                            case 6:
                            default:
                                System.out.println("Please enter valid choice: ");
                                break;
                        }
                    }
                    while (isOrdering);

                case 2:
                    System.out.println("AddressBook 2");
                    System.out.println("Welcome to AddressBook Project"
                            + "\n1. Add Contact Details"
                            + "\n2. View Contact details"
                            + "\n3.Update Contact details"
                            + "\n4. Delete Contact details"
                            + "\n5. Add multiple Contact in addressBook"
                            + "\n6. Exit ");
                    System.out.println("Enter the choice! :");
                    int choice1 = sc.nextInt();
                    // Switch Cases..........
                    switch (choice1) {
                        //Add contacts...
                        case 1:
                            System.out.println("Add Contacts: ");
                            addressBook1.addContact();
                            break;
                        // View Contact details....
                        case 2:
                            System.out.println("View Contact details....");
                            addressBook1.display();
                            break;
                        // Update Contacts.....
                        case 3:
                            System.out.println("Update Contacts: ");
                            addressBook1.updateContacts();
                            break;
                        // Delete Contacts....
                        case 4:
                            System.out.println("Delete Contacts: ");
                            addressBook1.deleteContacts();
                            break;
                        // Exit from program
                        case 5:
                            System.out.println("Ability to add multiple AddressBook..");
                            addressBook1.addMultipleContacts();
                            break;
                        case 6:
                        default:
                            System.out.println("Please enter valid choice: ");
                            break;
                    }
            }
            while (isOrdering1) ;
        } while (ordering);
    }
}

