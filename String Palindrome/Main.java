import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int len = str.length();
      boolean ismatch = true;
      int front = 0;
      int end = len-1;
     while(front < end)
     {
       if(str.charAt(front) != str.charAt(end))
       {
         ismatch = false;
         break;
       }
       front++;
       end--;
     }
      if(ismatch == true)
        System.out.print("Yes");
      else
        System.out.print("No");
         
           
       
      
      
    } 
}