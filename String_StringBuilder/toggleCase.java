package String_StringBuilder;
import java.util.*;

public class toggleCase {
    public static String toggleCase(String str){
		String ans = "";
		int len = str.length();
		for(int i = 0; i < len; i++){
		    char ch = str.charAt(i);
		    
		    if(ch >= 'a' && ch <= 'z'){
		        ans += (char)(ch- 'a' + 'A');
		        
		    }else if(ch >= 'A' && ch <= 'Z'){
		        ans += (char)(ch- 'A' + 'a');
		    }
		}

		return ans;
	}
}
