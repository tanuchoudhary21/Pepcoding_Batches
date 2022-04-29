package TwoD_Arrays;
import java.util.*;

public class StateOfWakanda1 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    
    int arr[][] = new int[row][col];
    
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    
    for(int i = 0; i < col; i++){
        if(i % 2 == 0){
            for(int j = 0; j < row; j++){
                System.out.println(arr[j][i]);
            }
        }else{
            for(int j = row-1; j >= 0; j--){
                System.out.println(arr[j][i]);
            }
        }
    }
 }
}
