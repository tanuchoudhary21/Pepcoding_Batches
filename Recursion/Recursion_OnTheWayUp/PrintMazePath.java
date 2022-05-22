package Recursion.Recursion_OnTheWayUp;
import java.util.*;

public class PrintMazePath {
     public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    printMazePaths(0, 0, row - 1, col - 1, "");
    sc.close();
  }


  public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

    if (sr == dr && sc == dc) {
      System.out.println(psf);
      return;
    }

    if (sc + 1 <= dc) {
      printMazePaths(sr, sc + 1, dr, dc, psf + "h");
    }

    if (sr + 1 <= dr) {
      printMazePaths(sr + 1, sc, dr, dc, psf + "v");
    }

  }
}
