package Recursion.Recursion_With_ArrayList;
import java.util.*;

public class GetMazePath {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // cols
        ArrayList<String> ans = getMazePaths(0, 0, n-1, m-1);
        System.out.println(ans);
        sc.close();

    }

    
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        
        ArrayList<String> finalAns = new ArrayList<>();
        if(sc+1 <= dc){
            ArrayList<String> horizontal = getMazePaths(sr, sc+1, dr, dc);
            for(String hor : horizontal){
                finalAns.add("h"+hor);
            }
        }
        
        
        if(sr+1 <= dr){
            ArrayList<String> vertical = getMazePaths(sr+1, sc, dr, dc);
            for(String ver : vertical){
                finalAns.add("v"+ver);
            }
        }
        
        return finalAns;
    }
}
