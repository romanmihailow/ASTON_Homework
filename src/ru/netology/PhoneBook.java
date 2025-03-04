package ru.netology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {

    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }

    public List<String> get(String name) {
        return phoneBook.get(name);
    }

    public void printAll() {
        phoneBook.forEach((lastName, phones) ->
                System.out.println("Name: " + lastName + ", Phone: " + phones)
        );


    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alex", "12345");
        phoneBook.add("Alex", "67892");
        phoneBook.add("Ben", "22222");
        phoneBook.add("Steven", "33333");

        System.out.println("Alex Phone: " + phoneBook.get("Alex"));
        System.out.println("Ben Phone: " + phoneBook.get("Ben"));
        System.out.println("Steven Phone: " + phoneBook.get("Steven"));


        System.out.println("\nВсе записи справочника: ");
        phoneBook.printAll();
    }


}
