public class SecondMinMaxFromArray {
    public static void main(String[] args){
        System.out.println(secondMax(new int[]{1,2,3,4,5,6,7,6,5,3,6}));
    }

    public static int secondMax(int[] arr){
        int max = arr[0];
        int maxIndex = 0;
        for(int i =0; i<arr.length; i++){
            
            if(max <arr[i]){
                max=arr[i];
                maxIndex= i;
            }
        }

        int secondMax = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            
            if(i!=maxIndex && secondMax <arr[i]){
                secondMax=arr[i];
        
            }
        }
        return secondMax;
    }
}
