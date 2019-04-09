import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int a[] = new int[size];
      for(int i = 0; i < size; i++)
      {
        a[i] = in.nextInt();
      }
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int found = 1;
      for(int i = 1; i < size; i++)
      {
        if(a[i] == n1)
        {
          System.out.println(i);
        found = 0;
        
        break;
        }
      }
        if( found != 0)
          System.out.println("-1");
      
        int f = 1;
      
        for(int i = 1; i < size; i++)
      {
       
            if(a[i] == n2)
            {
          System.out.println(i);
          f = 0;
          break;
        }
    }
        if( f != 0)
          System.out.println("-1");
      
   }
}