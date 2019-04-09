import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str1 = in.nextLine(); 
    int count = 0;
    int len = str.length();
    int len1 = str1.length();
    int j, i;
    for(i = 0; i < (len-len1+1); i++)
    {
      for(j = 0; j < len1; j++)
      {
        if(str.charAt(i+j) == str1.charAt(j))
        continue;
        else
          break;
      }
      if(j == len1)
        count++;
  }
    System.out.print(count);
      
  } 
}