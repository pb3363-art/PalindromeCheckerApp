public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("       PALINDROME CHECKER APP    ");

        System.out.println("Version: 1.0.0\n");


        String original = "level";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("The word '" + original + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + original + "' is NOT a palindrome.");
        }

        System.out.println("\nProgram execution completed.");
    }
}