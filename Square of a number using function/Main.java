import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner ib = new Scanner(System.in);
      int n = ib.nextInt();
      int sq = square(n);
      System.out.print(sq);
    }
  public static int square(int i)
  {
    int j = i * i;
    return j;
	} 
}