package Recursion.Recursion_OnTheWayUp;
import java.util.Scanner;

public class PrintStairPath {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPaths(n, "");
        sc.close();

    }

    public static void printStairPaths(int n, String path) {
        if(n == 0){
            System.out.println(path);
            return;
        }
        
        for(int i = 1; i <= 3 && n-i >=0; i++){
            printStairPaths(n-i, path+i);
        }
    }
}
