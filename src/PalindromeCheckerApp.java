public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       PALINDROME CHECKER APP    ");
        System.out.println("=================================");
        System.out.println("Version: 1.0.0\n");

        String input = "A man a plan a canal Panama";

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("The sentence \"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("The sentence \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("\nProgram execution completed.");
    }

    private static boolean checkPalindrome(String str) {

        // Normalize: remove spaces & convert to lowercase
        String normalized = str.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
