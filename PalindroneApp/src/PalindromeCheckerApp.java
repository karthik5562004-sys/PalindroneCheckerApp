import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Optional: Convert to lowercase and remove spaces
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Push characters into stack
        for (int i = 0; i < processedInput.length(); i++) {
            stack.push(processedInput.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Check palindrome
        if (processedInput.equals(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}