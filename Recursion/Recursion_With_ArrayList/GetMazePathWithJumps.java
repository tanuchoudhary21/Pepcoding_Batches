package Recursion.Recursion_With_ArrayList;
import java.util.*;

public class GetMazePathWithJumps {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // rows
    int m = sc.nextInt(); // cols
    ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1);
    System.out.println(ans);
    sc.close();

  }

  public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    if (sr == dr && sc == dc) {
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }


    ArrayList<String> finalAns = new ArrayList<>();
    for (int jump = 1; jump <= dc; jump++) {
      if (sc + jump <= dc) {
        ArrayList<String> horizontal = getMazePaths(sr, sc + jump, dr, dc);
        for (String hor : horizontal) {
          finalAns.add("h" + (jump + hor));
        }
      }
    }



    for (int jump = 1; jump <= dr; jump++) {
      if (sr + jump <= dr) {
        ArrayList<String> vertical = getMazePaths(sr + jump, sc, dr, dc);
        for (String ver : vertical) {
          finalAns.add("v" + (jump + ver));
        }
      }
    }

    int min = Math.min(dr, dc);
    for (int jump = 1; jump <= min; jump++) {
      if (sr + jump <= dr && sc + jump <= dc) {
        ArrayList<String> diagonal = getMazePaths(sr + jump, sc + jump, dr, dc);
        for (String dir : diagonal) {
          finalAns.add("d" + (jump + dir));
        }
      }
    }

    return finalAns;

  }
}
