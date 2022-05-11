package Recursion.Introduction_To_Recursion;
import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int src = sc.nextInt();
    int dest = sc.nextInt();
    int aux = sc.nextInt();
    toh(num, src, dest, aux);
  }

  public static void toh(int n, int src, int dest, int aux) {
    if (n == 0) {
      return;
    }

    toh(n - 1, src, aux, dest);
    System.out.println(n + "[" + src + " -> " + dest + "]");
    toh(n - 1, aux, dest, src);
  }
}
