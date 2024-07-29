import java.util.*;
class PlaySwitch
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("enter friut name to know rate || Enter fruit number to check availability ");
    String fru=in.next();
    int av=in.nextInt();
    switch(fru){
        case "Apple"->System.out.println("rs.100");
        case "Banana"->System.out.println("rs.110");
        case "Carrot"->System.out.println("rs.1220");
        case "Jellyfruit"->System.out.println("rs.1010");
        case "Orange"->System.out.println("rs.10340");
        case "Grapes"->System.out.println("rs.1000");
        default->System.out.println("enter valid choice");}

    switch(av){
        case 1,2,3,4 ->System.out.println("available");
        case 5,6->System.out.println("not available");
    }
            


    
  }



}