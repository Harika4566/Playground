import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int temp = n;
      int count = 0;
      while( temp > 0 )
      {
        int r = temp % 10;
        count++;
        temp = temp / 10;
      }
      int temp1 = n;
      int sum = 0;
      int x;
      while( n > 0 )
      {
        int pow = 1;
    
        int r = n % 10;
       
        x = r;
        
           for( pow = 1; pow < count; pow++ )
           {
             r = r * x;
           }
        sum = sum + r;
        pow = 1;
        n = n / 10;
      }
      if( sum == temp1)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
           
        
        
      
        
       
      
	}
}