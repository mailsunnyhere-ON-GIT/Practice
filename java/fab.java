import java.util.*;
class fab{
public static void main(String args[])
{
int b=0;
int a=1;
Scanner input=new Scanner(System.in);
System.out.print("give the index of number u want to get in fibonacci series");
int k=input.nextInt();
while(0<k)
{
    int temp=a;
    a=a+b;
    System.out.println(a);
    b=temp;
    k--;
}
System.out.println(a);
}}