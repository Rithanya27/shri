import java.util.Scanner;

public class armstrong {
     public static void main(String[] args)  {  
    int c=0,a,temp;  
     System.out.println("Enter a number");
      Scanner ob=new Scanner(System.in);
 int n=ob.nextInt();
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
}  
