package Recursion.Recursion_OnTheWayUp;
import java.util.*;

public class PrintEncoding{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        printEncodings(num , "");
        sc.close();
    }

    public static void printEncodings(String str , String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        if(str.charAt(0) == '0'){
            return;
        }
        
        char ch = str.charAt(0);
        int digit1 = ch-'0';
        ch = (char)((digit1-1)+'a');
        printEncodings(str.substring(1), asf+ch);
        
        if(str.length() > 1){
            char ch1 = str.charAt(1);
            int digit2 = (digit1*10)+(ch1-'0');
            if(digit2 <= 26){
                ch1 = (char)((digit2-1)+'a');
                printEncodings(str.substring(2), asf+ch1);
            }
        }
    }
}