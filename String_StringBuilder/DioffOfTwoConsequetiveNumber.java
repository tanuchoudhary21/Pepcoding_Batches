package String_StringBuilder;
import java.util.*;

public class DioffOfTwoConsequetiveNumber {
    	public static String solution(String str){
		String ans = "";
		for(int i = 0; i < str.length()-1 ; i++){
		    int diff = (int)(str.charAt(i+1) - str.charAt(i));
		    ans+= str.charAt(i);
		    ans += diff;
		}
		ans += str.charAt(str.length()-1);

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}
}
