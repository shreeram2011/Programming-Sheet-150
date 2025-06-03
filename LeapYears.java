package PS1;
import java.util.*;

public class LeapYears {

    public static int checkLeapYear(int year){
        if(year % 4 == 0 && year % 100!= 0 || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
        return year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        checkLeapYear(year);
    }
}


//to make it more short and clean with the help of ternary operator
public class LeapYears{
    public static void main(String args[]){
        int year = new Scanner(System.in).nextInt();
        System.out.print(year + ((year % 4 == 0 && year % 100 != 0 || year % 400 ==0) ? " is a Leap Year." : " is not a Leap year."));
    }
}
