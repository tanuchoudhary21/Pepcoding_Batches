package Functions_Arrays;
import java.io.*;

public class InverseOfANumber {
    public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    int size = a.length;
    int resultArray[] = new int[size];
    
    for(int i = 0; i < size; i++){
        int index = a[i];
        resultArray[index] = i;
    }
    
    return resultArray;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}
