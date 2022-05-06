package TwoD_Arrays;
import java.util.*;

public class SaddlePrice {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[][] = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++){
            int svc = 0;
            for(int j = 1; j < n; j++){
                if(arr[i][j] < arr[i][svc]){
                    svc = j;
                }
            }
            
            boolean flag = true;
            for(int k = 0; k < n; k++){
                if(arr[k][svc] > arr[i][svc]){
                    flag = false;
                    break;
                }
            }
            
            if(flag == true){
                System.out.println(arr[i][svc]);
                return;
            }
        }
        
        System.out.println("Invalid input");
    }
}
