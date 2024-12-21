package PS1;
import java.util.*;

public class Factorial {

    public static int calculateFactorial(int number){
        if(number == 0 || number == 1){
            return 1;
        }

        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + calculateFactorial(number));
    }
}
