public class numberPalindromeV2 {
    public static void main(String[] args){
        System.out.println(findNumberPalindrome(2));
    }

    public static boolean findNumberPalindrome(int input){
        boolean isPalindrome = false;
        int x = input;
        int reversedNumber = 0;
        
        while(x>0){
            reversedNumber = (reversedNumber*10)+x%10;
            x=x/10;
        }

        if(input==reversedNumber){
            isPalindrome=true;
        }
        
        return isPalindrome;
    } 
}
