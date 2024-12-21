package PS1;
import java.util.*;

public class SumOfDigits {

    public static void sumDigits(int number){
        int sum = 0;
        while (number!= 0){
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sumDigits(num);
    }
}
