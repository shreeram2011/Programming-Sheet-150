package PS1;
import java.util.*;


public class EvenOdd {

    public static int checkOddEven(int num){
        
        if(num % 2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }

        return num;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        checkOddEven(num);
    }
}
