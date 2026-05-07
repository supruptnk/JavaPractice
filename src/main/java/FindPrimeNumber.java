public class FindPrimeNumber {

    public static String findPrime(int input){

        String isPrime = "not prime";
        int counter=0;
        if(input>0){
        for(int i =1; i<=input;i++){
            if(input%i==0){
                counter++;
            }
        }
        if (counter==2) {
            isPrime ="prime number";
        }
    }else{
        isPrime="Not valid for evaluation. Number less than 1";
    }
        
    

        return isPrime;
    }

    
    public static String findPrime(double input){
        return "not valid for evaluation. fractional number";
    }

    public static void main(String[] args){
        System.out.println(findPrime(1.5));
    }
    
}
