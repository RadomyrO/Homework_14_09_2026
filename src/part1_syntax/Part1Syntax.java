package part1_syntax;

import java.util.Scanner;

// Part 1. Syntax
public class Part1Syntax {

    public static void main(String[] args) {

        // Part 1.1 Variables of different types
        int age = 20;
        double price = 19.99;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Alex";

        System.out.println("Part 1.1 Variables:");
        System.out.println("int age = " + age);
        System.out.println("double price = " + price);
        System.out.println("char grade = " + grade);
        System.out.println("boolean isStudent = " + isStudent);
        System.out.println("String name = " + name);
        System.out.println();

        // Part 1.2 Number operations and type casting
        int a = 10;
        int b = 3;

        int sum = a + b;          // addition
        int difference = a - b;   // subtraction
        int product = a * b;      // multiplication
        int quotient = a / b;     // division (int / int = int)
        int remainder = a % b;    // modulus

        System.out.println("Part 1.2 Number operations:");
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);
        System.out.println("a % b = " + remainder);

        a++;   // increment
        b--;   // decrement
        System.out.println("after a++ : a = " + a);
        System.out.println("after b-- : b = " + b);

        // Type casting: int -> double (widening) and double -> int (narrowing)
        double aAsDouble = a;            // implicit widening cast
        int priceAsInt = (int) price;    // explicit narrowing cast
        System.out.println("int to double: " + aAsDouble);
        System.out.println("double to int (cut off decimals): " + priceAsInt);
        System.out.println();

        // Part 1.3 String operations
        String firstName = "John";
        String lastName = "Smith";
        String fullName = firstName + " " + lastName; // concatenation

        System.out.println("Part 1.3 String operations:");
        System.out.println("Full name: " + fullName);
        System.out.println("Length: " + fullName.length());
        System.out.println("Upper case: " + fullName.toUpperCase());
        System.out.println("Lower case: " + fullName.toLowerCase());
        System.out.println("Substring (0,4): " + fullName.substring(0, 4));
        System.out.println("Replace 'Smith' with 'Doe': " + fullName.replace("Smith", "Doe"));
        System.out.println();

        // Part 1.4 Input / Output operations
        Scanner scanner = new Scanner(System.in);
        System.out.println("Part 1.4 Input/Output:");
        System.out.print("Enter your favorite number: ");
        String favoriteNumberText = scanner.nextLine();
        int favoriteNumber = Integer.parseInt(favoriteNumberText);
        System.out.println("You entered: " + favoriteNumber);
        System.out.println("Doubled: " + (favoriteNumber * 2));
        System.out.println();

        /*
         * Part 1.5 Different comment types
         * this is a block comment
         */
        // this is a single-line comment
        /** javadoc comment */
        System.out.println("Part 1.5: comment examples are in the code (//, /* */, /** */)");
        System.out.println();

        // Part 1.6 Use debugger
        int debugValue = a + b;
        System.out.println("Part 1.6 Debugger demo value: " + debugValue);

        scanner.close();

        // Part 1.7 Compiler messages for different errors -> ErrorExamples.java
    }
}
