//Write a method that will take an array as an argument and reverse it.

import java.util.Arrays;

public class reverseWords {
  
    public static String reverseSen(String input){
        // int[] arr = {1,2,3,4,5};
        String[] arr = input.split(" ");
        int start =0;
        int end = arr.length -1;

        while(start<end){
            String tmp = arr[start];
            arr[start] = arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
        String newSentence = String.join(" ", arr);
        return newSentence;

    }

    public static void main(String[] args){
        String sentence = "a fox was running";
        // int[] arr = {1,2,3,4,5};
        System.out.println((reverseSen(sentence)));
    }
}
