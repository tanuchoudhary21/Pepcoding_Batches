package TwoD_Arrays;
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int arr[][] = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int tne = n*m;
        int cne = 0;
        int minrow = 0;
        int mincol = 0;
        int maxrow = n-1;
        int maxcol = m-1;
        
        while(cne < tne){
            for(int i = minrow; i <= maxrow && cne < tne; i++){
                System.out.println(arr[i][mincol]);
                cne++;
            }
            mincol++;
            
            for(int j = mincol; j <= maxcol && cne < tne; j++){
                System.out.println(arr[maxrow][j]);
                cne++;
            }
            maxrow--;
            
            for(int i = maxrow; i >= minrow && cne < tne; i--){
                System.out.println(arr[i][maxcol]);
                cne++;
            }
            maxcol--;
            
            for(int j = maxcol; j >= mincol && cne < tne; j--){
                System.out.println(arr[minrow][j]);
                cne++;
            }
            minrow++;
        }
    }
}
