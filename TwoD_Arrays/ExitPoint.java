package TwoD_Arrays;
import java.util.*;

public class ExitPoint {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int arr[][] = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] =sc.nextInt();
            }
        }
        
        int i = 0;
        int j = 0;
        int dir = 0;
        
        while(true){
            dir = (dir+arr[i][j]) % 4;
            // East
            if(dir == 0){
                j++;
            }
            // South
            else if(dir == 1){
                i++;
            }
            // West
            else if(dir == 2){
                j--;
            }
            // North
            else if(dir == 3){
                i--;
            }
            
            if(i < 0){
                i++;
                break;
            }else if(j < 0){
                j++;
                break;
            }else if(i == n){
                i--;
                break;
            }
            else if(j == m){
                j--;
                break;
            }
        }
        
        System.out.println(i);
        System.out.println(j);
    }

}
