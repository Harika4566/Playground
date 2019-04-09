import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    int i;
    for(i = 0; i < n; i++)
    {
      a[i] = in.nextInt();
    }
    int temp[] = new int[n];
  
    int k = 0;
    int count = 1;
    for(i = 0; i < n-1; i++)
    {
      for(int j = i+1; j < n; j++)
      {
        if(a[i] == a[j])
        {
          count++;
        }
      }
      temp[k] = count;
      k++;
    }
    int le = temp.length;
    int max_index = 0;
    for(i = 0; i < le; i++)
    {
      for(int j = i+1; j < le; j++)
      {
        if(temp[i] > temp[j])
        {
          max_index = i;
        }
      }
    }
    if(temp[max_index] == 1)
    {
      System.out.print(a[0]);
    }
    else
    System.out.print(a[max_index]);
    
  }
}