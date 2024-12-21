package PS1;
import java.util.*;

public class GCD {

    public static int checkGCD(int num1, int num2){
        if(num2 == 0){
            return num1;
        }

        return checkGCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        checkGCD(num1, num2);
        System.out.println("The GCD is " + checkGCD(num1, num2));
    }
}
