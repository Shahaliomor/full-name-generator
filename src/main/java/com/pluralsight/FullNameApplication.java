package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = input.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = input.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = input.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = input.nextLine().trim();

        String fullName = firstName;

        // add middle name only if user entered something
        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        // add last name
        fullName += " " + lastName;

        // add suffix with comma only if entered
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);

        input.close();
    }
}