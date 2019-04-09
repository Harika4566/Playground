import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    int a[][] = new int[m][n];
    int i,j;
    for(i = 0; i < m; i++)
    {
      for(j = 0; j < n; j++)
      {
        a[i][j] = in.nextInt();
      }
    }
    int b[][] = new int[n][m];
    for(i = 0; i < n; i++)
    {
      for(j = 0; j < m; j++)
      {
        b[i][j] = a[j][i];
      }
    }
    for(i = 0; i < m; i++)
    {
      for(j = 0; j < n; j++)
      {
        System.out.print(b[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}