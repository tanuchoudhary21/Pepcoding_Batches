package Recursion.Backtracking;

import java.util.Scanner;

public class FloodFill {
    
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    boolean visited[][] = new boolean[n][m];
    floodfill(arr, 0, 0, "", visited);
    scn.close();
  }

  // asf -> answer so far
//   Method1
  public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean visited[][]) {

    if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1 || visited[sr][sc] == true) {
      return;
    }

    if (sr == maze.length - 1 && sc == maze[0].length - 1) {
      System.out.println(asf);
      return;
    }

    visited[sr][sc] = true;
    // Top
    floodfill(maze, sr - 1, sc, asf + "t", visited);
    // Left
    floodfill(maze, sr, sc - 1, asf + "l", visited);
    // Bottom
    floodfill(maze, sr + 1, sc, asf + "d", visited);
    // Right
    floodfill(maze, sr, sc + 1, asf + "r", visited);

    visited[sr][sc] = false;

  }

//   Method 2
public static void floodfill(int[][] maze, int sr, int sc, String asf) {

    if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1) {
      return;
    }

    if (sr == maze.length - 1 && sc == maze[0].length - 1) {
      System.out.println(asf);
      return;
    }

    maze[sr][sc] = 1;
    // Top
    floodfill(maze, sr - 1, sc, asf + "t");
    // Left
    floodfill(maze, sr, sc - 1, asf + "l");
    // Bottom
    floodfill(maze, sr + 1, sc, asf + "d");
    // Right
    floodfill(maze, sr, sc + 1, asf + "r");

    maze[sr][sc] = 0;

  }
}
