import java.util.Scanner;
public class powerof2 {
   public static void powerOftwo(int number)
{
int num = number;
int d;
boolean flag = true;
while(num>1)
{
d = num % 2;
if(d%2!=0)
{
flag = false;
break;
}
num = num/2;

}
if(flag == true)
{
System.out.println("Number is a power of 2");
}
else
{
System.out.println("Number is not a power of 2");
}

}
public static void main(String[] args) 
{
System.out.println("Enter a number");
      Scanner ob=new Scanner(System.in);
 int number=ob.nextInt();
powerof2 obj = new powerof2();
obj.powerOftwo(number);

}

}



