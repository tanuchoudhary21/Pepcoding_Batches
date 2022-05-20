package Recursion.Recursion_With_ArrayList;
import java.util.*;

public class GetStairsPath {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> ans = getStairPaths(num);
        System.out.println(ans);
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n <= 0){
            ArrayList<String> base = new ArrayList<>();
            if(n == 0){
                base.add("");
                return base;
            }else{
                return base;
            }
        }

        ArrayList<String> steps1 = getStairPaths(n-1);
        ArrayList<String> steps2 = getStairPaths(n-2);
        ArrayList<String> steps3 = getStairPaths(n-3);
        ArrayList<String> finalAns = new ArrayList<>();
        
        for(String step : steps1){
            finalAns.add(1+step);
        }
        
        for(String step : steps2){
            finalAns.add(2+step);
        }
        
        for(String step : steps3){
            finalAns.add(3+step);
        }
        
        return finalAns;
    }
}
