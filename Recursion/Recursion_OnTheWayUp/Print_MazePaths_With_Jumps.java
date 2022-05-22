package Recursion.Recursion_OnTheWayUp;
import java.util.Scanner;


public class Print_MazePaths_With_Jumps {
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

    for (int jump = 1; sc + jump <= dc; jump++) {
      printMazePaths(sr, sc + jump, dr, dc, psf + "h" + jump);
    }

    for (int jump = 1; sr + jump <= dr; jump++) {
      printMazePaths(sr + jump, sc, dr, dc, psf + "v" + jump);
    }

    for (int jump = 1; sc + jump <= dc && sr + jump <= dr; jump++) {
      printMazePaths(sr + jump, sc + jump, dr, dc, psf + "d" + jump);
    }
  }

}
