public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       PALINDROME CHECKER APP    ");
        System.out.println("=================================");
        System.out.println("Version: 1.0.0\n");

        String input = "racecar";

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("The word '" + input + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + input + "' is NOT a palindrome.");
        }

        System.out.println("\nProgram execution completed.");
    }

    private static boolean checkPalindrome(String str, int left, int right) {

        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return checkPalindrome(str, left + 1, right - 1);
    }
}