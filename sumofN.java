
import java.util.Scanner;


public class Natural 
{
    public static void main(String args[])
    {
        int N, i ;
        int sum = 0;
        System.out.println("Enter value of N:");
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        for(i=1;i<=N;i++)
        {
            sum = sum +i;
           
        }
        System.out.println("Sum of "+N+" numbers is :"+sum);
    } 
}
