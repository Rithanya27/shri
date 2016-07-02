
package leap_year;
import java.util.Scanner;


public class Leap_year {

   
    public static void main(String[] args) {
      
        System.out.println("enter the year:\t");
        Scanner year=new Scanner(System.in);
        char c=year.next().charAt(0);
        System.out.println(c);
        int n=year.nextInt();
        if(n%4==0)
        {
            System.out.println("the year is a leap year\t");
        }
        else{
            System.out.println("the year is not a leap year\t");
        }
    }
    
}
