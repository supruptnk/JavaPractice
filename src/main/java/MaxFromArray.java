//Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.

public class MaxFromArray {
    
    public static void main(String[] args){
            System.out.println(findMax(new int[]{-10,-8,-3,-4,-5,-6}));
    }

    public static int findMax(int[] arr){
        int max=arr[0];

        for(int i:arr){
            if(i>max){
                max=i;
            }
            
        }

        return max;

    }
}
