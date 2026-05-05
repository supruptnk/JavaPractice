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
        String newSentence = String.join(" ", arr).trim();
        return newSentence;

    }

    public static void main(String[] args){
        String sentence = "a fox was running";
        String sentence1 = "a truck was moving at a very high speed on a narrow road.";
        String sentence2 = "word";
        // int[] arr = {1,2,3,4,5};
        System.out.println((reverseSen(sentence)));
        System.out.println((reverseSen(sentence1)));
        System.out.println((reverseSen(sentence2)));
    }
}

/*
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
        System.out.println(revWords("I am John Doe")); // Doe John am I
        System.out.println(revWords("orange")); // orange
    }

    public static String revWords(String str) {
        StringBuilder res = new StringBuilder();

        // split input string by " " space to get each word as String[]
        String[] words = str.split(" ");

        // loop over the array from back
        for(int i = words.length - 1; i >= 0; i--) {
            // add words to res with space
            res.append(words[i]).append(" ");
        }

        // trim needed to remove last space in the end
        return res.toString().trim();
    }
}
*/