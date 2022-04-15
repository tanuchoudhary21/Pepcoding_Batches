package Getting_Started;
import java.util.*;
public class printAllPrimeNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lo = sc.nextInt();
    int high = sc.nextInt();
    int count = 0;
    
    for(int n = lo; n <= high; n++){
        count = 0;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                count++;
                break;
            }
        }
        
        if(count == 0){
            System.out.println(n);
        }
    }
  }
}
