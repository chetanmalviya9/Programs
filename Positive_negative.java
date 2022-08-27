import java.util.*;
class Positive_negative
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int k=0;
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
			   a[k]=arr[i];
			   k++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if (arr[i]<0)
			{
			   a[k]=arr[i];
			   k++;
			}
		}
		for(int i=0;i<n;i++)
		{
		     arr[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"  ");
		}
}
}

				
