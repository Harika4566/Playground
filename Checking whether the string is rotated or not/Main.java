import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String str1 = in.nextLine();
      String temp = new String("");
      temp = str.concat(str);
      if(temp.contains(str1))
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}