import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int copy_number = n;
      int digit_count = 0;
      if(n == 0)
      {
        System.out.println(n);
      }
      else
      {
        while(n > 0)
        {
          digit_count ++;
          n = n / 10;
        }
      }
      n = copy_number;
      int sum = 0;
      int pow = 1;
      while(n > 0)
      {
        int rem = n % 10;
        for(int count = 1; count <= digit_count; count ++)
        {
          pow = pow * rem;
        }
        sum = sum + pow;
        pow = 1;
        n = n / 10;
      }
      if(sum == copy_number)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}