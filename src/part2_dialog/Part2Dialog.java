package part2_dialog;

import java.util.Scanner;

// Part 2. Dialog
public class Part2Dialog {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! I'm a small chatbot. Let's get to know each other.");
        System.out.println("Please answer a few questions about yourself.");
        System.out.println();

        // Part 2. Dialog - collecting information step by step

        // 1) String
        System.out.print("What is your first name? ");
        String firstName = scanner.nextLine();

        // 2) String
        System.out.print("What is your last name? ");
        String lastName = scanner.nextLine();

        // 3) int
        System.out.print("How old are you (in years, whole number)? ");
        int age = Integer.parseInt(scanner.nextLine());

        // 4) String
        System.out.print("Which city do you live in? ");
        String city = scanner.nextLine();

        // 5) double
        System.out.print("What is your height in meters (e.g. 1.75)? ");
        double height = Double.parseDouble(scanner.nextLine());

        // 6) double
        System.out.print("What is your weight in kilograms (e.g. 65.5)? ");
        double weight = Double.parseDouble(scanner.nextLine());

        // 7) char
        System.out.print("What is your favorite letter of the alphabet (one character)? ");
        char favoriteLetter = scanner.nextLine().charAt(0);

        // 8) boolean
        System.out.print("Are you currently a student? (yes/no) ");
        boolean isStudent = scanner.nextLine().trim().equalsIgnoreCase("yes");

        // 9) String
        System.out.print("What is your favorite hobby? ");
        String hobby = scanner.nextLine();

        // 10) int
        System.out.print("In which year were you born? ");
        int birthYear = Integer.parseInt(scanner.nextLine());

        // 11) String - used later for the chatbot part
        System.out.print("Tell me a short sentence about yourself: ");
        String aboutMe = scanner.nextLine();

        // Part 2 - Chatbot reactions using String operations
        // contains(), startsWith(), indexOf()
        System.out.println();
        System.out.println("Let me react to what you told me...");

        if (hobby.toLowerCase().contains("game") || hobby.toLowerCase().contains("gaming")) {
            System.out.println("Nice, a fellow gamer! I like games too.");
        } else {
            System.out.println("\"" + hobby + "\" sounds like a great hobby!");
        }

        if (firstName.startsWith("A") || firstName.startsWith("a")) {
            System.out.println("Cool, your name starts with the letter A!");
        }

        int wordIndex = aboutMe.toLowerCase().indexOf("love");
        if (wordIndex != -1) {
            System.out.println("I noticed the word \"love\" in your sentence at position " + wordIndex + ".");
        } else {
            System.out.println("Thanks for sharing that sentence with me.");
        }

        // Part 2. Summary - print all collected information back to the user
        System.out.println();
        System.out.println("========== SUMMARY ==========");
        System.out.println("Full name    : " + firstName + " " + lastName);
        System.out.println("Age          : " + age);
        System.out.println("City         : " + city);
        System.out.println("Height       : " + height + " m");
        System.out.println("Weight       : " + weight + " kg");
        System.out.println("Favorite letter : " + favoriteLetter);
        System.out.println("Is student   : " + isStudent);
        System.out.println("Hobby        : " + hobby);
        System.out.println("Birth year   : " + birthYear);
        System.out.println("About me     : " + aboutMe);
        System.out.println("==============================");
        System.out.println("Thanks for the chat, " + firstName + "! Have a great day!");

        scanner.close();
    }
}
