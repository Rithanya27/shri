
package odd_even;

import java.util.Scanner;


public class Odd_even {

    public static void main(String[] args) {
        
        
              System.out.println("Enter a number");
      Scanner ob=new Scanner(System.in);
 int n=ob.nextInt();

        if(n%2==0) 
        {
            System.out.println("n is even\t");
        }
            else
        {
            System.out.println("n is odd\t");
        }
        
    }
}
