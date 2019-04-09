import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = n;
      int i;
      for(i = 1; i <= n; i++)
      {
        for(int j = 1; j <= (n-(i-1)); j++)
        {
          System.out.print(count);
          count--;
        }
        System.out.println();
        count = n - i;
      }
      
                       
	}
}