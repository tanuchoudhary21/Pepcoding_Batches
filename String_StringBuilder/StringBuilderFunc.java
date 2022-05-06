package String_StringBuilder;

public class StringBuilderFunc {
    public static void main(String args[]){
       StringBuilder sb = new StringBuilder("Hello");
       System.out.println(sb);
       
       char ch = sb.charAt(1);
       System.out.println(ch);
       
       sb.setCharAt(1, 'a'); // Modify
       System.out.println(sb);
       
       sb.insert(2, 'a'); // To add char in b/w
       System.out.println(sb);
       
       sb.append('o'); // To add char at the end
       System.out.println(sb);
       
       sb.deleteCharAt(2);
       System.out.println(sb);
       
       System.out.println(sb.length());
    }
}
