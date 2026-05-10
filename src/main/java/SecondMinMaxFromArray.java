public class SecondMinMaxFromArray {
    public static void main(String[] args){
        System.out.println(findSecondMax(new int[]{1,2,3,4,5,6,7,6,5,3,6}));
        System.out.println(findSecondMin(new int[]{1,2,3,4,5,6,7,6,5,3,6}));
    }

    public static int findSecondMax(int[] arr){
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

    public static int findSecondMin(int[] arr){
        int min = arr[0];
        int minIndex = 0;
        for(int i =0; i<arr.length; i++){
            
            if(min >arr[i]){
                min=arr[i];
                minIndex= i;
            }
        }

        int secondMin = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            
            if(i!=minIndex && secondMin >arr[i]){
                // System.out.println("post secondmin: "+secondMin+" ; number:"+arr[i]);
                secondMin=arr[i];
                // System.out.println("post secondmin: "+secondMin+" ; number:"+arr[i]);
            }
        }
        return secondMin;
    }

}


