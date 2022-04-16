package Getting_Started;
import java.util.*;

public class ReverseANumber {
    public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     
     while(num != 0){
         int rem = num % 10; // Last Digit
         System.out.println(rem);
         num = num/10;
     }
    }
}
