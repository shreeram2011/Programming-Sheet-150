package PS1;
import java.util.*;


public class Palindrome {

    public static void isPalindrome(String str){
        String str1 = str.replaceAll(" ", "").toLowerCase();
        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str1.charAt(i);
        }

        if(str.equals(reversed)){
            System.err.println("String is palindrome!");
        }
        else{
            System.out.println("String is not palindrome!");
        }

            
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        isPalindrome(str);
    }
}
