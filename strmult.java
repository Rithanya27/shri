import java.util.Scanner;
public class strintmult {
    public static void main(String[] args)
    {
        String str1="";
        String str2="";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st string : ");
        str1 = in.nextLine();
        System.out.print("Enter the 2nd string : ");
        str2 = in.nextLine();
        
        int a = Integer.parseInt(str1.trim());
        int b = Integer.parseInt(str2.trim());
        
        int c=a*b;
        StringBuilder sb=new StringBuilder();
        sb.append(c);
       String res=sb.toString();
       System.out.print("result is"+res);
    }
}
