package Getting_Started;
import java.util.*;

public class DigitsOfANumber {
    public static void main(String[] args) {
      // write your code here  
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      
      int temp = num;
      int digit = 0;
      
      while(temp != 0){
          temp = temp/10;
          digit++;
      }
      
      int div = (int)Math.pow(10, digit-1);
      
      while(div != 0){
          int q = num / div;
          System.out.println(q);
          
          num = num %div;
          div = div/10;
      }
     }
}
