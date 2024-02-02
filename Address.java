package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Address {
    Contact obj =new Contact();
    Scanner sc=new Scanner(System.in);
    ArrayList<Contact> ContactList = new ArrayList<>();
    void addContact() {
        System.out.println("Enter The First Name");
        obj.setFirstName(sc.next());
        System.out.println("Enter The Last Name");
        obj.setLastName(sc.next());
        System.out.println("Enter the city ");
        obj.setCity(sc.next());
        System.out.println("Enter the state ");
        obj.setState(sc.next());
        System.out.println("Enter the Zip ");
        obj.setZip(sc.next());
        System.out.println("Enter the PhoneNumber ");
        obj.setPhoneNumber(sc.next());
        System.out.println("Enter the EmailId ");
        obj.setEmailId(sc.next());
        ContactList.add(obj);
    }
    void show() {
        if(obj.getFirstName()==null){
            System.out.println("Not Found");
        }
        else {

            System.out.println(ContactList.toString());

        }
    }
    void editContact() {
        //Get First Name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        //check if the Given User with First Name
        if(!firstName.equals(obj.getFirstName())) {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        } else
        {
            System.out.println("Enter The First Name");
            obj.setFirstName(sc.next());
            System.out.println("Enter The Last Name");
            obj.setLastName(sc.next());
            System.out.println("Enter the city ");
            obj.setCity(sc.next());
            System.out.println("Enter the state ");
            obj.setState(sc.next());
            System.out.println("Enter the Zip ");
            obj.setZip(sc.next());
            System.out.println("Enter the PhoneNumber ");
            obj.setPhoneNumber(sc.next());
            System.out.println("Enter the EmailId ");
            obj.setEmailId(sc.next());
        }
    }
    void DeleteContact(){
        //Get First Name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        //check if the Given User with First Name
        if(!firstName.equals(obj.getFirstName())) {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        } else
        {
            obj.setFirstName(null);
            obj.setLastName(null);
            obj.setCity(null);
            obj.setState(null);
            obj.setZip(null);
            obj.setPhoneNumber(null);
            obj.setEmailId(null);
        }
    }


}
