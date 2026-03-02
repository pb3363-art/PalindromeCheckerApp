public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("       PALINDROME CHECKER APP    ");

        System.out.println("Version: 1.0.0");
        System.out.println("Welcome to the Palindrome Checker Application!\n");

        

        String word = "madam"; 

        String reversed = "";

      
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

       
        if (word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }

        System.out.println("\nProgram execution completed.");
    }
}
