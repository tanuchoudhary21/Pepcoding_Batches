package Getting_Started;

import java.util.*;

import java.util.*;
   
   public class RotateANumber{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     
     int temp = n;
     int digit = 0;
     while(temp != 0){
         temp = temp/10;
         digit++;
     }
     
     k = k % digit;
     if(k < 0){
         k = k + digit;
     }
     
     int div = 1;
     int mul = 1;
     
     for(int i = 1; i <= digit; i++){
         if(i <= k){
             div = div *10;
         }else{
             mul = mul*10;
         }
     }
     
     int rem = n%div;
     int q = n/div;
     
     int rot = rem*mul+q;
     System.out.println(rot);
    }
   }