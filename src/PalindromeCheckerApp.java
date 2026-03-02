import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   PALINDROME PERFORMANCE TEST   ");
        System.out.println("=================================\n");

        String input = generateLargePalindrome(10000);

        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        System.out.println("\nPerformance comparison completed.");
    }

    private static String generateLargePalindrome(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    private static boolean twoPointerCheck(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    private static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray())
            stack.push(ch);

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop())
                return false;
        }
        return true;
    }

    private static boolean dequeCheck(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (char ch : str.toCharArray())
            deque.addLast(ch);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }
        return true;
    }
}