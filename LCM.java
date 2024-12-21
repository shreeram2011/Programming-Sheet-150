package PS1;
import java.util.*;


public class LCM {

    public static int checkGCD(int num1, int num2){
        if(num2 == 0){
            return num1;
        }

        return checkGCD(num2, num1 % num2);
    }

    public static int checkLCM(int num1, int num2){
        int lcm = (num1 * num2) / checkGCD(num1, num2);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        checkLCM(num1, num2);
        System.out.println("The LCM is " + checkLCM(num1, num2));
    }
}
