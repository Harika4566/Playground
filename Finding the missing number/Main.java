import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      int i, j;
      for(i = 0; i < n; i++)
      {
        a[i] = in.nextInt();
      }
      int flag = 0;
      for(i = 1; i <= n; i++)
      {
        for(j = 0; j < n; j++)
        {
          if(a[j] == i)
            flag = 1;
        }
        if(flag == 0)
          System.out.print(i);
        else
          flag = 0;
      }
    }
}