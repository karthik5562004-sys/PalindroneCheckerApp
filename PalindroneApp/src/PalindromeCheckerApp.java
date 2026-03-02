import java.util.Scanner;

public class PalindromeCheckerApp {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Welcome to the Palindrome Checker App!");

          System.out.print("Enter a string to check if it is a palindrome: ");
          String originalString = scanner.nextLine();

          // Reverse the string using a loop
          String reversedString = "";
          for (int i = originalString.length() - 1; i >= 0; i--) {
               reversedString += originalString.charAt(i);
          }

          // Compare original and reversed strings using equals() method
          if (originalString.equals(reversedString)) {
               System.out.println("\"" + originalString + "\" is a palindrome!");
          } else {
               System.out.println("\"" + originalString + "\" is NOT a palindrome.");
          }

          scanner.close();
     }
}

