public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       PALINDROME CHECKER APP    ");
        System.out.println("=================================");
        System.out.println("Version: 1.0.0\n");

        String input = "RaceCar";

        // Create service object
        PalindromeChecker service = new PalindromeChecker();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("The word \"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("\nProgram execution completed.");
    }

    // ==============================
    // OOPS SERVICE CLASS
    // ==============================
    static class PalindromeChecker {

        // Public method exposed
        public boolean checkPalindrome(String str) {

            // Normalize input (case-insensitive)
            String normalized = str.toLowerCase();

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
}