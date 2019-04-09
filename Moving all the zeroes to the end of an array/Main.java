import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      int i;
      for(i = 0; i < n; i++)
      {
        a[i] = in.nextInt();
      }
      zero(a,n);
      for(i = 0; i < n; i++)
      {
        System.out.print(a[i]);
        System.out.print(" ");
      }
    }
  public static void zero(int a[], int n)
  {
    int n1[] = new int[n];
int j = 0;
    int i;
    int count = 0;
    for(i = 0; i < n; i++)
    {
      if(a[i] == 0)
        count++;
    }
    for(i = 0; i < n; i++)
    {
      if((a[i] != 0))
      {
        n1[j] = a[i];
        j++;
      }
    }
    for(j = 0, i = 0; j < (n-count); j++)
    {
      a[i] = n1[j];
      i++;
    }
    for(i = j; i < n; i++)
    {
      a[i] = 0;
    }
          
    }
}