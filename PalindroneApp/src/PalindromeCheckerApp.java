import java.util.Scanner;

public class PalindromeCheckerApp {

     /**
      * Checks if a given string is a palindrome.
      * @param input The string to check.
      * @param ignoreCase Whether to ignore case sensitivity.
      * @param ignoreSpaces Whether to ignore spaces.
      * @param ignorePunctuation Whether to ignore punctuation.
      * @return true if the string is a palindrome under the given conditions.
      */
     public static boolean isPalindrome(String input, boolean ignoreCase, boolean ignoreSpaces, boolean ignorePunctuation) {
          if (input == null) {
               return false;
          }

          String processed = input;

          // Remove spaces if required
          if (ignoreSpaces) {
               processed = processed.replaceAll("\\s+", "");
          }

          // Remove punctuation if required
          if (ignorePunctuation) {
               processed = processed.replaceAll("[\\p{Punct}]", "");
          }

          // Ignore case if required
          if (ignoreCase) {
               processed = processed.toLowerCase();
          }

          // Compare with reverse
          String reversed = new StringBuilder(processed).reverse().toString();
          return processed.equals(reversed);
     }

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("=== Palindrome Checker App ===");
          System.out.print("Enter a string: ");
          String input = scanner.nextLine();

          // Get user preferences
          boolean ignoreCase = getYesNo(scanner, "Ignore case? (y/n): ");
          boolean ignoreSpaces = getYesNo(scanner, "Ignore spaces? (y/n): ");
          boolean ignorePunctuation = getYesNo(scanner, "Ignore punctuation? (y/n): ");

          // Check palindrome
          boolean result = isPalindrome(input, ignoreCase, ignoreSpaces, ignorePunctuation);

          // Output result
          if (result) {
               System.out.println("✅ The given string IS a palindrome under the chosen conditions.");
          } else {
               System.out.println("❌ The given string is NOT a palindrome under the chosen conditions.");
          }

          scanner.close();
     }

     /**
      * Utility method to get a yes/no response from the user.
      */
     private static boolean getYesNo(Scanner scanner, String prompt) {
          while (true) {
               System.out.print(prompt);
               String response = scanner.nextLine().trim().toLowerCase();
               if (response.equals("y") || response.equals("yes")) {
                    return true;
               } else if (response.equals("n") || response.equals("no")) {
                    return false;
               } else {
                    System.out.println("Please enter 'y' or 'n'.");
               }
          }
     }
}


