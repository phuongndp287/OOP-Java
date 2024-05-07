package oop.recruiment.utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputValidator {

    private Scanner scanner;

    public InputValidator() {
        this.scanner = new Scanner(System.in);
    }

    public String inputString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public int inputYear(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                int year = Integer.parseInt(input);
                return year;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year (yyyy):");
            }
        }
    }

    public String inputPhone(String prompt) {
        while (true) {
            System.out.println(prompt);
            String phone = scanner.nextLine();
            if (phone.matches("\\d{7,}")) {
                return phone;
            } else {
                System.out.println("Invalid phone number. It must be at least 7 positive numbers. Please try again:");
            }
        }
    }

    public String inputEmail(String prompt) {
        while (true) {
            System.out.println(prompt);
            String email = scanner.nextLine();
            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                return email;
            } else {
                System.out.println("Invalid email format. Please try again:");
            }
        }
    }

    public int inputInt(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer:");
            }
        }
    }

    public LocalDate inputDate(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return LocalDate.parse(scanner.nextLine());
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in the format yyyy-mm-dd:");
            }
        }
    }

    public String inputGraduationRank(String prompt) {
        while (true) {
            System.out.println(prompt);
            String rank = scanner.nextLine();
            if (rank.equalsIgnoreCase("Excellence") || rank.equalsIgnoreCase("Good") ||
                    rank.equalsIgnoreCase("Fair") || rank.equalsIgnoreCase("Poor")) {
                return rank;
            } else {
                System.out.println("Invalid graduation rank. Please choose from (Excellence, Good, Fair, Poor):");
            }
        }
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
