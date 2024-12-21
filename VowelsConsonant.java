package PS1;
import java.util.*;

public class VowelsConsonant {

    public static void checkVowel(String str){
        str = str.replaceAll(" ", "").toLowerCase();
        int vowel = 0;
        int consonant = 0;
        for(char c : str.toCharArray()){
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowel++;
            }
            else{   
                consonant++;
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        checkVowel(str);
    }
}
