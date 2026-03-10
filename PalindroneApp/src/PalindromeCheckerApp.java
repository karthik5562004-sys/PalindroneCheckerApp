import java.util.*;

public class PalindromeCheckerApp {

    // Algorithm 1: Using Reverse String
    public static boolean reverseMethod(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }

    // Algorithm 2: Using Array
    public static boolean arrayMethod(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
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

    // Algorithm 3: Using Stack
    public static boolean stackMethod(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Array Method
        long start2 = System.nanoTime();
        boolean result2 = arrayMethod(input);
        long end2 = System.nanoTime();

        // Stack Method
        long start3 = System.nanoTime();
        boolean result3 = stackMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Array Method: " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Stack Method: " + result3 + " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}