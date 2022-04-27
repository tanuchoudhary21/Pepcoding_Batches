package Functions_Arrays;
import java.util.*;

public class FindElementInArray {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int data = sc.nextInt();

    int result = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] == data) {
        result = i;
        break;
      }
    }

    if(result != -1){
        System.out.println(result);
    }else{
        System.out.println(-1);
    }
    
  }

}
