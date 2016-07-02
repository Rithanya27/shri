
package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
    
          System.out.println("Enter a number");
      Scanner ob=new Scanner(System.in);
 int n=ob.nextInt();

        int result=fact(n);
        System.out.println(result);
    }
  static  int fact(int n)
    {
        int result;
        if(n<=1)
                {
                return 1;
                }
        else
        {
            result=n*fact(n-1);
        }
        return result;
    }
}
    

