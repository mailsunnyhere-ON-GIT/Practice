//prints all armstrong number between 100 and 1000
public class arm
{
 public static void main(String[] args)
 {
    for(int i=100;i<1000;i++){
    if(callarm(i))
    {

        System.out.println(i+"  ");
    }

 }
 }
   static boolean callarm(int i)
   {
    int sum=0;
    int temp=i;
    int rem=0;
    while(i>0){
    rem=i%10;
    sum=sum+rem*rem*rem;
    i=i/10;}

        return temp==sum;
   }
}