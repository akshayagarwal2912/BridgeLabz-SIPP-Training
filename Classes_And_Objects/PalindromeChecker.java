class PalindromeChecker {
    String text;

    // Constructor to initialize text
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    // Method to display the result
    void showResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("Madam");
        p.showResult();
    }
}
