package Recursion.Recursion_With_ArrayList;
import java.util.*;

public class GetKPC {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String num = sc.next();
    ArrayList<String> ans = getKPC(num);
    System.out.println(ans);
    sc.close();
  }

  static String[] words = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

  public static ArrayList<String> getKPC(String str) {

    if (str.length() == 0) {
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }

    char ch = str.charAt(0);
    String substr = str.substring(1);

    ArrayList<String> smallAns = getKPC(substr);

    ArrayList<String> finalAns = new ArrayList<>();
    int idx = ch - '0';
    String word = words[idx];
    for (int i = 0; i < word.length(); i++) {
      char cha = word.charAt(i);
      for (String s : smallAns) {
        finalAns.add(cha + s);
      }
    }

    return finalAns;
  }

}
