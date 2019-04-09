import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = sod(n);
      System.out.print(sum);
    }
  public static int sod( int i )
  {
    int su = 0;
    for(int j = 1; j <= i; j++)
    {
       su = su + j;
    }
    return(su);
    
	}
}