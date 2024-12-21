package PS1;
import java.util.*;

public class StarPattern {

    public static void pyramid(int height){
        for(int i = 0; i < height; i ++){
            for(int j = 0; j < height - i - 1; j ++){
                System.out.print(" ");
            }

            for(int j = 0; j < (2*i) + 1; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height : ");
        int height = sc.nextInt();
        pyramid(height);
    }
}
