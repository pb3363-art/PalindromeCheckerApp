import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       PALINDROME CHECKER APP    ");
        System.out.println("=================================");
        System.out.println("Version: 1.0.0\n");


        String input = "level";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word '" + input + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + input + "' is NOT a palindrome.");
        }

        System.out.println("\nProgram execution completed.");
    }
}