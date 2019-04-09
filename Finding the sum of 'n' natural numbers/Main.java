import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = sumn(n);
      System.out.print(sum);
    }
  public static int sumn(int n)
  {
    if(n == 1)
    {
      return 1;
    }
    else
    {
      return(n + sumn(n-1));
    }
  
    }
}