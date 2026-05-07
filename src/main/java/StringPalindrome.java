public class StringPalindrome {

    public static String findPalindrome(String input){
        String newInput = input.toLowerCase();
        String decision = " is palindrome";
        
        char[] arr = newInput.toCharArray();
        int inputLength = arr.length-1;
        for(int i=0;i<inputLength/2;i++){
            if(arr[i] != arr[inputLength-i]){
                System.out.println(arr[i]+" "+arr[inputLength-i]);
                decision=" is not palindrome";
                break;
            }
        }
        String isPalindrome=input+decision;
        return isPalindrome;
    }

    public static void main(String[] args){
        System.out.println(findPalindrome("Supus"));
    }
    
}

/*
public static boolean isPal(String str) {
        // we will use two 'pointers'. One pointer will start looking from beginning
        // another from the back. If values of pointers are not equal, we can return false

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // if pointers values are not equal return false
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        // if program reach here, it means all values were equal, so it's palindrome
        return true;
    }
}
*/