//Write a method that will take an array as an argument and reverse it.

import java.util.Arrays;

public class arrayReverse {
  
    public static int[] reverseTheArray(int[] arrayObject){
        // int[] arr = {1,2,3,4,5};
        
        int start =0;
        int end = arrayObject.length -1;

        while(start<end){
            int tmp = arrayObject[start];
            arrayObject[start] = arrayObject[end];
            arrayObject[end]=tmp;
            start++;
            end--;
        }
        return arrayObject;

    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseTheArray(arr)));
    }
}
