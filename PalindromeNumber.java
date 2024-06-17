public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321; // Replace with the number you want to check
        
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
    
    // Function to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        // Compare originalNumber with reversedNumber
        return originalNumber == reversedNumber;
    }
}