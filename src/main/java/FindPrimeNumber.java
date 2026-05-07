public class FindPrimeNumber {

    public static boolean findPrime(int input){

        boolean isPrime = true;
        int counter=0;
        for(int i =1; i<=input;i++){
            if(input%i==0){
                counter++;
            }
        }
        if (counter>2) {
            isPrime =false;
        }

        return isPrime;
    }

    public static void main(String[] args){
        System.out.println(findPrime(2));
    }
    
}
