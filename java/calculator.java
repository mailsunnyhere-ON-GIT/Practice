import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        int result=0;
        Scanner in=new Scanner(System.in);
        while(true)
        { 

             
           System.out.println("enter the numbers");
           int a=in.nextInt();
           int b=in.nextInt();

            System.out.println("enter the operation || enter X or x to exit");
           char op=in.next().trim().charAt(0);
            
          
            if(op=='x'||op=='X'){
           break;}
           if(op=='+'){
           result=a+b;}
           if(op=='-'){
           result=a+b;}
           if(op=='*'){
           result=a*b;}
           if(op=='/'){
            if(b==0){
           result=a/b;}}
           else if(op=='%'){
           result=a%b;}
           else{
        System.out.println("Invalid input ");

           }

          
           
           
          System.out.println("result is" +result);

        }

        

    }
}