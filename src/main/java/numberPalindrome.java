import java.util.ArrayList;
import java.util.List;

public class numberPalindrome {

    public static void main(String[] args){
        System.out.println(fineNumberPalindrome(1234321));
    }

    public static boolean fineNumberPalindrome(int input){
        boolean isPalindrome = true;
        List<Integer> numberList = new ArrayList<>();
        
        while(input%10>0){
            numberList.add(input%10);
            input=input/10;
        }

        System.out.println(numberList);
        int start = 0;
        int end = numberList.size()-1;

        while(start<end){
            if(numberList.get(start)!=numberList.get(end)){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        
        return isPalindrome;
    }
    
}
