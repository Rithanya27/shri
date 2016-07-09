import java.util.Scanner;


public class weekdays {

  
    public static void main(String[] args) {
     String day="";
     Scanner s=new Scanner(System.in);
      System.out.println("enter the day");
     day=s.nextLine();
     
     switch(day)
     {
         case "monday":
             System.out.println("true");
             break;
              case "tuesday":
             System.out.println("true");
             break;
       case "wednesday":
             System.out.println("true");
             break;
    case "thursday":
             System.out.println("true");
             break; 
      case "friday":
             System.out.println("true");
             break;
      default:
           System.out.println("false");
             break;
     }
    }
    
}
