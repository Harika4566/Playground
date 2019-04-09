import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,k;
      int j = 0;
      int count = 0;
      int temp[] = new int[n];
      int a[] = new int[n];
      for(i = 0; i < n; i++)
      {
        a[i] = in.nextInt();
      }
      for(i = 0; i < n; i++)
      {
        if(a[i] == 1)
        {
         count++;
        }
           else if(a[i] == 0)
           {
             temp[j] = count;
             j++;
             count = 0;
             break;
           }
           }
      int len = temp.length;
      for(i = 0; i < len; i++)
      {
        for(k = i+1; k < len; k++)
        {
          if(temp[i] < temp[k])
          {
            int t = temp[i];
            temp[i] = temp[k];
            temp[k] = t;
          }
        }
      }
        System.out.print(temp[0]);
            
           
          
    }
}