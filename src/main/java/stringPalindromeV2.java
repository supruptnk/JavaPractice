public class stringPalindromeV2 {
    public static void main(String[] args){
        System.out.println(findPalindrome("null"));
        System.out.println(findPalindrome("pyramid"));
        System.out.println(findPalindrome("Supragyan"));
        System.out.println(findPalindrome("madam"));
    }

    public static String findPalindrome(String input){
        String newInput = input.toLowerCase();
        String isPalindrome = " is a palindrome";
        int start = 0;
        int end = newInput.length()-1;
        while(start<end){
            if(newInput.charAt(start)!=newInput.charAt(end)){
                isPalindrome = " is not a palindrome";
                
            }
            start++;
                end--;
        }
        return input+isPalindrome;
        
    }
}
