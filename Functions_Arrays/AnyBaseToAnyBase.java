package Functions_Arrays;
import java.util.*;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
    int  destBase = scn.nextInt();
    int ans = toDecimal(n, sourceBase);
    int finalAns = toDestBase(ans, destBase);
    System.out.println(finalAns);

  }

  public static int toDecimal(int n, int sb) {
    int pow = 1;
    int ans = 0;
    while (n != 0) {
      int rem = n % 10;
      ans += pow * rem;
      pow *= sb;
      n /= 10;

    }
    return ans;
  }

  public static int toDestBase(int n, int db) {
    int pow = 1;
    int ans = 0;
    while (n != 0) {
      int rem = n % db;
      ans += pow * rem;
      pow *= 10;
      n /= db;

    }
    return ans;

  }
}
