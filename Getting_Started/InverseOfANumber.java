package Getting_Started;
import java.util.*;

public class InverseOfANumber {
    public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int origianlPosition = 1;
  int inverse = 0;
  
  while(num != 0){
      int originalDigit = num %10;
      int inversePosition = originalDigit;
      int inverseDigit = origianlPosition;
      
      inverse = inverse + inverseDigit*(int)Math.pow(10, inversePosition-1);
      
      num = num/10;
      origianlPosition++;
  }
  
  System.out.println(inverse);
 }
}
