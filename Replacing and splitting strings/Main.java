import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      String Str1 = sc.nextLine();
      String Str2 = sc.nextLine();
      int no_of_parts = sc.nextInt();
      String Str3 = Str1.replace(Str1,Str2);
      String flag[] = Str3.split(" " ,no_of_parts);
      for(String res : flag)
        System.out.println(res);
      
      
    }
}