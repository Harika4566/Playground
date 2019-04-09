import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      prime(n);
    }
  public static void prime(int m)
  {
    int flag = 0;
    for(int i = 2; i <= m; i++)
    {
      for(int j = 2; j <= i; j++)
      {
        if((i != j)&&(i % j == 0))
          flag = 1;
      }
      if( flag == 0 )
       
          System.out.println(i);
      else
        flag = 0;
      }
    
    
	}
}