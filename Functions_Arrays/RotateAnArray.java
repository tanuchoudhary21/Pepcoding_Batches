package Functions_Arrays;
import java.io.*;

public class RotateAnArray {
    public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  
  public static void reverse(int a[], int i, int j){
      while(i < j){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
          i++;
          j--;
      }
  }

  public static void rotate(int[] a, int k){
    // write your code here
    int len = a.length;
    k = k%len;
    if(k < 0){
        k = k + len;
    }
    
    reverse(a, 0, len-k-1);
    reverse(a, len-k, len-1);
    reverse(a, 0, len -1);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }
}
