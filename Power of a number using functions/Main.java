import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int ex = in.nextInt();
    int res = power(base,ex);
    System.out.print(res);
  }
  public static int power(int b, int x)
  {
    int r = 1;
    for(int i = 1; i <= x; i++)
    {
      r = r * b;
    }
    return r;
  }
}