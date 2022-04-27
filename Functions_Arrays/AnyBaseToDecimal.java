package Functions_Arrays;
import java.util.*;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int d = getValueIndecimal(n, b);
    System.out.println(d);
  }

  public static int getValueIndecimal(int n, int b) {
    int newNum = 0;
    int digit = 0;
    int power = 1;
    
    while(n > 0){
        digit = n % 10;
        n = n/10;
        
        newNum += digit * power;
        power = power * b;
    }
    return newNum;
  }
}
