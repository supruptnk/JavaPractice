//A pangram is a sentence containing every letter in the English Alphabet (a-z).

public class findIfPangram {
    static public void main(String[] args){
        System.out.println(checkPangram("Pack my box with five dozen liquor jugs."));
    }

    static public boolean checkPangram(String input){
        boolean[] alpha = new boolean[26];
        for(int j=0;j<26;j++){alpha[j]=false;}
        String newInput = input.toUpperCase();
        
        for(int i=0;i<newInput.length();i++){
            char c = newInput.charAt(i);
            if(c>='A' && c<='Z'){
                int index = c-'A';
                // alpha[index] = alpha[index]&&false;
                alpha[index] = true;
            }
        }
        for(int k=0;k<26;k++){
            if(!alpha[k]){
                return false;
            }    
        }

        return true;
    }
}
