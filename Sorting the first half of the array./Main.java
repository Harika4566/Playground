import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    int i;
    for(i = 0; i < n; i++)
    {
      a[i] = in.nextInt();
    }
    half(n,a);
  }
  public static void half(int n, int a[])
  {
    int i, j;
    int k = n/2;
    for(i = 0; i < k; i++)
    {
      for(j = i+1; j < k;j++)
      {
        if(a[i] > a[j])
        {
          int t = a[i];
          a[i] = a[j];
          a[j] = t;
        }
      }
    }
    for(i = 0; i < n; i++)
    {
      System.out.print(a[i] + " ");
    }
  }
}