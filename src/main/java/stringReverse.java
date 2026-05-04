public class stringReverse {

    public static String reverseString(String input){
        String reverse = "";
        
        char[] arr = input.toCharArray();
        for(char c : arr){
            reverse = c+reverse;
        }

        return reverse;

    }


    public static void main(String[] arr){
        System.out.println(reverseString("Supragyan"));
    }
    
}
