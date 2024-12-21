package PS1;
import java.util.*;

public class CheckPrime {
    public static int checkPrime1(int num){
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
        return num;
    }

    public static boolean checkPrime2(int num){
        if(num <= 1){
            System.out.println(num + " is not a prime number");
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.println(num + " is not a prime number");
                return false;
            }
        }
        System.out.println(num + " is a prime number");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPrime1(num);
        checkPrime2(num);
    }
}
