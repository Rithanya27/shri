
import java.util.Scanner;

public class Total {

    public static void main(String[] args) {
    
          System.out.println("Enter a number");
      Scanner ob=new Scanner(System.in);
 int n=ob.nextInt();

        int result=m(n);
        System.out.println(result);
    }
  static  int m(int n)
    {
        int result;
        if(n<1)
                {
                return 0;
                }
        else
        {
            result=n+m(n-1);
        }
        return result;
    }
}
    
