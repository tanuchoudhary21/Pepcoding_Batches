package Recursion.Recursion_With_ArrayList;
import java.util.*;

public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
        sc.close();

    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch = str.charAt(0);
        String substr = str.substring(1);
        ArrayList<String> smallAns = gss(substr);
        
        ArrayList<String> finalAns = new ArrayList<>();
        
        for(String s : smallAns){
            finalAns.add(s);
        }
        
        for(String s : smallAns){
            finalAns.add(ch+s);
        }
        
        return finalAns;
    }
}
