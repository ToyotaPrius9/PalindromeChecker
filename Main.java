import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static boolean validate(String inputString) {
        Stack<Character> stack = new Stack<>();    // new Stack object for storing characters of the input string
        for (int i = 0; i < inputString.length(); i++) {   // loop for each character in the input string
            char c = inputString.charAt(i);    // obtain current character at index i
            stack.push(c);  // yeet the current character to da stack
        }
        for (int i = 0; i < inputString.length(); i++) {   // loop for each character in the input string, again...
            char c = inputString.charAt(i);    // obtain current character at index i, again...
            if (stack.pop() != c) { // pop the top character from the stack and compare it to the current character
                return false;   // if they're not equal, the input string is sus (not palindrome), so return false!
            }
        }
        return true;    // if all characters match, the input string is bussin (a palindrome), so return true
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // create a new Scanner object to read user input from the console
        System.out.print("Enter da string to check if it's a palindrome: "); // prompt the user to enter a string
        String inputString = scanner.nextLine();    // read input string
        scanner.close();    // close the scanner, just good practice.... or so i heard...

        boolean isPalindrome = validate(inputString); // call the validate() method to check if the input string is a palindrome
        if (isPalindrome) { // if the input string is a palindrome:
            System.out.println("THAT IS A PALINDROME!");    // print a message indicating that it's a palindrome
        } else {    // If the input string is not a palindrome
            System.out.println("THAT AIN'T NO PALINDROME!"); // Print a message indicating that it's not a palindrome
        }
    }
}