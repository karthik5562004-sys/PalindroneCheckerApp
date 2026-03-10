import java.util.Scanner;

class PalindromeCheckerApp {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // String preprocessing
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Using Array as internal data structure
        char[] arr = normalized.toCharArray();

        int left = 0;
        int right = arr.length - 1;


        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Object creation (OOP concept)
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}