package Getting_Started;
import java.util.*;

public class CountDigitsInANumber {
    public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int digit = 0;
    
    while(n != 0){
        n = n / 10;
        digit++;
    }
    System.out.println(digit);
   }
}
