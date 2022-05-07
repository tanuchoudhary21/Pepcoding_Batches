package String_StringBuilder;
import java.util.*;

public class PrintPermutationRecursively {
    public static void solution(String str){
	    int n = factorial(str.length());
	    
	    for(int i = 0; i < n; i++){
	        StringBuilder sb = new StringBuilder(str);
	        int divident = i;
	        for(int div = str.length(); div >= 1; div--){
	            int q = divident/div;
	            int rem = divident % div;
	            System.out.print(sb.charAt(rem));
	            divident = q;
	            sb.deleteCharAt(rem);
	        }
	        System.out.println();
	    }
		
	}
	
	public static int factorial(int n){
	    int fact = 1;
	    for(int i = 2; i <= n; i++){
	        fact = fact*i;
	    }
	    return fact;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
