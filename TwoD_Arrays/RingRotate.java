package TwoD_Arrays;
import java.util.*;

public class RingRotate {
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
        
        int shellNo = sc.nextInt();
        int rotateNo = sc.nextInt();
        
        int oneD[] = fillOneDArray(arr, shellNo);
        rotate(oneD, rotateNo);
        fillFromOneDArray(arr, oneD, shellNo);
        display(arr);
        
    }
    
    public static int[] fillOneDArray(int arr[][], int shellNo){
        int minr = shellNo-1;
        int minc = shellNo-1;
        int maxr = arr.length - shellNo;
        int maxc = arr[0].length - shellNo;
        int size = 2*maxr - 2*minr + 2*maxc - 2*minc;
        int oneDArray[] = new int[size];
        int idx = 0;
        
        for(int i = minr; i <= maxr; i++){
            oneDArray[idx++] = arr[i][minc];
        }
        minc = minc+1;
        
        for(int j = minc; j <= maxc; j++){
            oneDArray[idx++] = arr[maxr][j];
        }
        
        maxr = maxr-1;
        for(int i = maxr; i >= minr; i--){
            oneDArray[idx++] = arr[i][maxc];
        }
        
        maxc = maxc-1;
        
        
        for(int j = maxc; j >= minc; j--){
            oneDArray[idx++] = arr[minr][j];
        }
        
        return oneDArray;
        
    }
    
    public static void fillFromOneDArray(int arr[][], int oneDArray[], int shellNo){
        int minr = shellNo-1;
        int minc = shellNo-1;
        int maxr = arr.length - shellNo;
        int maxc = arr[0].length - shellNo;
        int idx = 0;
        
        for(int i = minr, j = minc; i <= maxr; i++){
            arr[i][minc] = oneDArray[idx++];
        }
        minc = minc+1;
        
        for(int j = minc; j <= maxc; j++){
            arr[maxr][j] = oneDArray[idx++];
        }
        
        maxr = maxr-1;
        for(int i = maxr; i >= minr; i--){
            arr[i][maxc] = oneDArray[idx++];
        }
        
        maxc = maxc-1;
        
        
        for(int j = maxc; j >= minc; j--){
            arr[minr][j] = oneDArray[idx++];
        }
    }
    
    public static void reverse(int oneD[], int si, int ei){
        while(si < ei){
            int temp = oneD[si];
            oneD[si] = oneD[ei];
            oneD[ei] = temp;
            si++;
            ei--;
        }
    }
    
    public static void rotate(int oneD[], int k){
        int len = oneD.length;
        k = k % len;
        if(k < 0){
            k = k + len;
        }
        
        reverse(oneD, 0, len-k-1);
        reverse(oneD, len-k, len-1);
        reverse(oneD, 0, len-1);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
