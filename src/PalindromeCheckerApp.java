import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   PALINDROME CHECKER APP (UC12)");
        System.out.println("=================================\n");

        String input = "level";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();


        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.check(input);

        if (result) {
            System.out.println("The word \"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("\nProgram execution completed.");
    }

    interface PalindromeStrategy {
        boolean check(String input);
    }

    static class StackStrategy implements PalindromeStrategy {

        public boolean check(String input) {

            Stack<Character> stack = new Stack<>();

            for (char ch : input.toCharArray()) {
                stack.push(ch);
            }

            for (char ch : input.toCharArray()) {
                if (ch != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }
==
    static class DequeStrategy implements PalindromeStrategy {

        public boolean check(String input) {

            Deque<Character> deque = new LinkedList<>();

            for (char ch : input.toCharArray()) {
                deque.addLast(ch);
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    static class PalindromeService {

        private PalindromeStrategy strategy;

        public PalindromeService(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String input) {
            return strategy.check(input);
        }
    }
}