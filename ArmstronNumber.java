package PS1;
import java.util.*;

public class ArmstronNumber {

    public static int countDigit(int num){
        int count = 0;
        while(num != 0){
            num = num /10;
            count ++;
        }
        return count;
    }

    public static int isArmstrong(int num){
        int n = countDigit(num);
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int r = temp % 10;
            sum = sum + (int)Math.pow(r, n);
            temp = temp / 10;
        }
        if(sum == num){
            System.out.println(num + " is an Armstrong number");
        }else{
            System.out.println(num + " is not an Armstrong number");
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        isArmstrong(num);
    }
}


//Another method to make it more clean and short

public class ArmstronNumber{
    public static void main(String args[]){
        int num = new Scanner(System.in).nextInt(), sum = 0, temp = num, n = (num + "").length();
        
        while(temp != 0){
            int r = temp % 10;
            sum += Math.pow(r,n);
            temp = temp / 10;
        }
        
        System.out.print(num + (sum == num ? " is an Armstrong no." : " is not an Armstrong no."));
        
    }
}
