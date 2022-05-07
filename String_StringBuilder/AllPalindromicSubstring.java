package String_StringBuilder;
import java.util.*;

public class AllPalindromicSubstring {
    	public static void solution(String str){
		String substr = "";
		for(int i = 0; i < str.length(); i++){
		    for(int j = i+1; j <= str.length(); j++){
		        substr = str.substring(i, j);
		        if(Palindrome(substr) == true){
		            System.out.println(substr);
		        }
		    }
		}
	}
	
	public static boolean Palindrome(String substr){
	    int startIndex = 0;
	    int endIndex = substr.length() -1;
	    while(startIndex <= endIndex){
	        char ch1 = substr.charAt(startIndex);
	        char ch2 = substr.charAt(endIndex);
	        
	        if(ch1 != ch2){
	            return false;
	        }
	        
	        startIndex++;
	        endIndex--;
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
