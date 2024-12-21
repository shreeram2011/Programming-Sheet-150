package PS1;
import java.util.*;

public class Fibonacci {

    public static void FibonacciSeries(int n){
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for(int i = 2; i < n; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit : ");
        int num = sc.nextInt();
        FibonacciSeries(num);
    }
}
