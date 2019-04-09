import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int len = str.length();
      int a[] = new int[26];
      int i;
      int offset;
      for(i = 0; i < 26; i++)
      {
        a[i] = 0;
      }
      for(i = 0; i < len; i++)
      {
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
        {
          offset = str.charAt(i) - 'a';
        a[offset]++;
        }
        if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
        {
          offset = str.charAt(i) - 'A';
        a[offset]++;
        }
      }
      for(i = 0; i < 26; i++)
      {
        if(a[i] == 0)
        {
          char ch = (char) (i + 'a');
          System.out.print(ch + " ");
        }
      }
      
        
        
    }
}