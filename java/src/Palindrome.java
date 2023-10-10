public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(reverseString(s));
            System.out.println(isPalindrome(s));
        }
    }

    public static boolean isPalindrome(String s) {
        return reverseString(s).equals(s);
    }

    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

