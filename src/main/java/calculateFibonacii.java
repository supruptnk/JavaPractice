//fibonacii with recursion
import java.util.List;
import java.util.ArrayList;


public class calculateFibonacii {
    

    public static void main(String[] args){
        int iterations = 10;
        int[] arr = new int[iterations];
        // List<Integer> arr = new ArrayList<Integer>();
        int i =0;
        while(i<iterations){
            if(i<2){
                arr[i]=1;
            }else{
                int x = nextNumber(arr[i-1], arr[i-2]);
                arr[i]=x;
            }
            i++;
        }
    System.out.println("Fibonacii for "+iterations+" iterations is: ");
        for(int j: arr){
            System.out.print(j+", ");

        }
    }

    public static int nextNumber(int senior, int superSenior){
        return (senior+superSenior);
        
    }
}
