import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int fact = 1;
      while(n > 0 )
      {
        fact = fact * n;
        n--;
      }
      System.out.println(fact);
	}
}