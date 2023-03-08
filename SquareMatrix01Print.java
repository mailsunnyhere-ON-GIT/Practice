import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SquareMatrix01Print
{
	int arr[][]=new int[7][7];
	int n=arr.length;
	int k=n-1;
	int l=n-2;
void printArr(int n)
{
   for(int m=0;m<n;m++)
	for(int p=0;p<n;p++)
	   {
	    System.out.print(arr[m][p]+" ");
	   }
	System.out.println();
}
int takea(int k)
{
   int i;
   
   while(k>=0)
   for(i=k;i>=n-1-k;i--)
   
	{
	   arr[k][i]=1;
	   arr[i][k]=1;
	}
   
  // return take0(k-2);
}
int takeb(int l)
{
   int j;
   
   while(l>=0)
   for(j=l;j<n-l;j++)
   
	
	{
	   arr[k][j]=0;
	   arr[j][k]=0;
	}
//   return take1(l-2);
}


  
   public static void main(String args[])
   {
	
	
	takea();
	takeb();
	printArr(n);
   }