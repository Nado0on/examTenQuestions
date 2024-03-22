package main;
import java.util.Scanner;

public class AssignmentExam {


    public static void main(String[] args) {
        int[] myArrayofNums = {1, 2, 3, 4, 5, 6, 7, 8};
        int sideLength = 5; // Example: side length of the cube
        int year = 2020 ; // replace with the year you want to check
        String arrayForStrings = "A goat, a sheep, a camel: Kiki The Camel";
        printOddsOnly();
        getUserInputAndPrintSum();
        printAverage(myArrayofNums);
        printRandomNumber();
        calculateSumOfEvens(myArrayofNums);
        printCubeVolume(sideLength); // Calling the method to directly print the volume
        countAndPrintCharacterOccurrence("example string", 'e');

        checkLeapYear(year);
        printTicketInfo();
    }


    // 1. create a method that only prints odd numbers from 10 down to 1
    public static void printOddsOnly() {
        //checking for odd numbers, checking if the remainder is not 0 then it is odd
        for (int i = 10; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i); //print my outcome
            }

        }
    }

    // 2. Write a method that takes an array of integers and returns the sum of all the numbers.
    public static void getUserInputAndPrintSum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt(); // Reading the size of the array
        int[] numbers = new int[size]; // Initialize the array with the specified size

        System.out.println("Enter the elements of the array:"); // Asking user to enter specific numbers to create the array with
        // for loop is determinining how many times this code block will run which is dependant on the array size that's entered in first question
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); // Reading each integer to fill the array
        }

        // Calculate the sum of the array elements by creating container to hold the values of int
        int sum = 0;
        // below is another version of a for each loop it reviews the element in the nummbers array and then the element value is stored in int sum container
        for (int num : numbers) {
            sum += num;
        }

        // Print the sum to the console
        System.out.println("The sum of the array is: " + sum);

        scanner.close(); // Close the scanner
    }

    // 3. Create a method that calculates the average of the numbers in an array.

    public static void printAverage(int[] arrayName) {
        int sum = 0; // empty container to hold value to be divided
        for (int i = 0; i < arrayName.length; i++) {
            //each time the for loop executes, this adds the value of the current array element to the running total stored in sum
            sum += arrayName[i];
        }
        //calculate the average and store it in variable named average
        double average = (double) sum / arrayName.length;
        System.out.println("The average is  " + average);
    }

    // 4. Create a method that generates a random number from 1 to 6
    public static void printRandomNumber() {
        int randomNumber = (int) (Math.random() * 6) + 1; // Generate a random number between 1 and 6
        System.out.println("Random number between 1 and 6: " + randomNumber); // Print the generated number
    }

    // 5.  Write a method that calculates the sum of all even numbers in an array.
    public static void calculateSumOfEvens(int[] array) {
        int sum = 0; // Initialize sum to 0
        for (int num : array) {
            if (num % 2 == 0) { // Check if the number is even
                sum += num; // Add even number to sum
            }
        }
        System.out.println("Sum of even numbers: " + sum); // Print the sum of even numbers
    }


    // 6. Write a method that calculates the volume of a cube.
    public static void printCubeVolume(int side) {
        int volume = side * side * side; // Calculating the cube volume
        System.out.println("The volume of the cube is: " + volume); // Printing the volume directly
    }


    // 7. Write a method to count how many times a particular character appears in a String.
    public static void countAndPrintCharacterOccurrence(String text, char characterToCount) {
        int count = 0; // Initialize a counter to store the number of occurrences.

        // Loop over the entire string, one character at a time.
        for (int i = 0; i < text.length(); i++) {
            // Check if the current character matches the one we're counting.
            if (text.charAt(i) == characterToCount) {
                count++; // If it matches, increment the counter by one.
            }
        }
        // Print out the result in a formatted message, showing the character and the count.
        System.out.println("The character '" + characterToCount + "' appears " + count + " times in the string.");
    }

    // 8. Create a method that determines if a String is a palindrome.
    public static void palindromeCheck(String input) {

    }


    // 9. Create a method that checks if a year is a leap year.
    public static void checkLeapYear(int year) {

        // A year is a leap year if it is divisible by 4 but not by 100 or it is divisible by 400.
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // 10. Create a method that first scans for a user's ticket number
    public static void printTicketInfo() {
        Scanner scanner = new Scanner(System.in);
    // Ask the user to enter their ticket number and wait for input
        System.out.print("Enter your ticket number: ");
        int ticketNumber = scanner.nextInt(); // Read the entered ticket number

        // takes away the extra newline character left after reading the ticket number
        scanner.nextLine();

        // Ask the user to enter their destination and wait for input
        System.out.print("Enter your destination: ");
        String destination = scanner.nextLine(); // Read the entered destination

        // Print a message including the ticket number and destination to confirm service
        System.out.println("Now serving customer number " + ticketNumber + ". Enjoy your trip to " + destination + ".");
        // Close the scanner
        scanner.close();
    }

}



