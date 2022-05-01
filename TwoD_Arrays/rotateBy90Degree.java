package TwoD_Arrays;
import java.util.*;

public class rotateBy90Degree {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        // transpose;
        for(int i = 0; i < n ; i++){
            for(int j = i; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        // Inverse;
        for(int i = 0; i < n; i++){
            int si = 0; 
            int ei = n-1;
            while(si <= ei){
                int temp = arr[i][si];
                arr[i][si] = arr[i][ei];
                arr[i][ei] = temp;
                si++;
                ei--;
            }
        }
        // display(arr);
        
    }
}
