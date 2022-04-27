package Functions_Arrays;
import java.util.*;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }
 
 public static int getProductHelper(int b, int n1, int d2){
     int resultValue = 0;
     int pow = 1;
     int carry = 0;
     
     while(n1 > 0 || carry > 0){
         int d1 = n1%10;
         n1 = n1/10;
         int d = d1*d2 + carry;
         carry = d / b;
         d = d % b;
         resultValue += d*pow;
         pow *= 10;
     }
     return resultValue;
 }
 
 public static int getSum(int b, int n1, int n2){
     int carry = 0;
       int result = 0;
       int pow = 1;
       
       while(n1 != 0 || n2 != 0 || carry != 0){
           int d1 = n1%10;
           n1 = n1/10;
           
           int d2 = n2%10;
           n2 = n2/10;
           
           int sum = d1+d2+carry;
           int lastDigit = sum % b;
           carry = sum / b;
           
           result += (lastDigit*pow);
           pow = pow*10;
       }
       return result;
 }

 public static int getProduct(int b, int n1, int n2){
    int resultValue = 0;
    int pow = 1;
    while(n2 > 0){
        int d2 = n2%10;
        n2 = n2/10;
        
        int singleDigitMultiplication = getProductHelper(b, n1, d2);
        
        singleDigitMultiplication *= pow;
        
        resultValue = getSum(b , resultValue, singleDigitMultiplication);
        pow *= 10;
    }
    return resultValue;
 }

}
