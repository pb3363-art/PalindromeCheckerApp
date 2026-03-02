public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       PALINDROME CHECKER APP    ");
        System.out.println("=================================");
        System.out.println("Version: 1.0.0\n");

        String input = "radar";
        char[] characters = input.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The word '" + input + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + input + "' is NOT a palindrome.");
        }

        System.out.println("\nProgram execution completed.");
    }
}