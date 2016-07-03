
import java.util.*;

public class prime {
    




static Scanner sc = new Scanner (System.in);
public static void main(String[] args)
{
System.out.println("Enter A Number :");
int n=sc.nextInt();

if(n==2)
{
System.out.println("\n2 is a prime number");
}
for(int i=2;i<n;i++)
{
if(n%i==0)
{
System.out.print("\n"+n+" is not a prime number");
break;
}
else
{
System.out.print("\n"+n+" is a prime number");
break;
}
}
}
}
