import java.util.Scanner;

public class PalindromeCheckerApp {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter text to check: ");
          String input = scanner.nextLine();

          if (isPalindrome(input)) {
               System.out.println("✅ It's a palindrome!");
          } else {
               System.out.println("❌ Not a palindrome.");
          }

          scanner.close();
     }

     private static boolean isPalindrome(String text) {
          // Normalize: remove non-alphanumeric chars, ignore case
          String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
          String reversed = new StringBuilder(cleaned).reverse().toString();
          return cleaned.equals(reversed);
     }
}
