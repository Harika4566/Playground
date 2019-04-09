import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        a[i] = in.nextInt();
      }
      int val = in.nextInt();
      pair(n,a,val);
    }
  public static void pair(int n, int a[], int val)
  {
    int i, j;
    for(i = 0; i < n-1; i++)
    {
      for(j = i+1; j < n; j++)
      {
        if((a[i] + a[j]) == val)
        {
          System.out.print(a[i] + ", " + a[j]);
          System.out.println();
        }
      }
    }
    }
}