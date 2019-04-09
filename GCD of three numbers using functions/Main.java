import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int g1 = gcd(n1,n2);
      int res = gcd(g1,n3);
      System.out.print(res);
    }
  public static int gcd(int a, int b)
  {
    int r;
    int min;
    if(a > b)
      min = b;
    else
      min = a;
    while( min >= 0)
    {
    if((a % min == 0)&&(b % min == 0))
    break;
    else
      min--;
  }
    return min;
      
       
	}
}