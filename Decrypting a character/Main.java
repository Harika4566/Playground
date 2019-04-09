import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      
      Scanner in = new Scanner(System.in);
      char c = in.next().charAt(0);
      int key = in.nextInt();
      if( c >= 'a' && c <= 'z' )
      c = (char)(c + 26 - key);
      else if( c >= 'A' && c <= 'Z')
        c = (char)(c - key);
      System.out.print(c);
    }
}