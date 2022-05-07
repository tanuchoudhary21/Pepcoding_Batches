package String_StringBuilder;
import java.util.*;

public class removePrimeNumber {
    
	public static void solution(ArrayList<Integer> al){
		for(int i = al.size() - 1 ; i >= 0; i--){
		    int x = al.get(i);
		    if(isPrime(x)){
		        al.remove(i);
		    }
		}
		
	}
	
	public static boolean isPrime(int x){
	    int count = 0;
	    for(int i = 2; i*i <= x; i++){
	        if(x%i == 0){
	            count++;
	        }
	    }
	    
	    if(count == 0){
	        return true;
	    }else{
	        return false;
	    }
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}
}
