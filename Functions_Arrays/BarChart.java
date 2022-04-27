package Functions_Arrays;
import java.util.*;

public class BarChart {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int max = Integer.MIN_VALUE;// -infinity
    
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        max = Math.max(max, arr[i]);
    }
    
    for(int i = 0; i < max; i++){ // Floor
        for(int j = 0; j < n; j++){ // Buildings
            int height = arr[j];
            if(height >= max-i){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }
}
