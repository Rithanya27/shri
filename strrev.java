import java.util.Scanner;

public class strrev {
    
    public static void main(String[] args)
    {
        String str,rev;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        str = in.nextLine();
        rev = new StringBuffer(str).reverse().toString();
        System.out.println("\nString before reverse:"+str);
        System.out.println("String after reverse:"+rev);
    }
}
