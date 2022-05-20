package Recursion.Recursion_OnTheWayUp;
import java.util.*;

public class PrintKPC {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    printKPC(str, "");
    sc.close();
  }

  static String[] words = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

  public static void printKPC(String str, String asf) {
      if(str.length() == 0){
          System.out.println(asf);
          return;
      }


    char ch = str.charAt(0);
    String sub = str.substring(1);
    int index = ch-'0';
    String word = words[index];
    
    for(int i = 0; i < word.length();i++){
        printKPC(sub, asf+word.charAt(i));
    }
  }

}
