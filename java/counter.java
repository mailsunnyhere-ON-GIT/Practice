import java.util.*;
public class counter
{
    public static void main(String args[]){
        int flag=0;
    Scanner i=new Scanner(System.in);
    System.out.println("Enter the number");
    int k=i.nextInt();
    while(0<k){
    int l=k%10;
    if(l==7){
    flag++;}
    k=k/10;
    System.out.println(k);
    }

    System.out.println(flag);
}
}