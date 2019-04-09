import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      a[i] = in.nextInt();
    }
    batch(a,n);
  }
  public static void batch(int a[], int n)
  {
    int i;
    int sum = (a[0] + a[1] + a[2]);
    for(i = 3; i < n; i+=3)
    {
      if(sum == (a[i] + a[i+1] + a[i+2]))
        continue;
      else
        break;
    }
    if(i == n)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}