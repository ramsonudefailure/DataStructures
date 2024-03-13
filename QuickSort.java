package DataStructures;
import java.util.Scanner;
public class QuickSort {
	public static int partition(int a[],int start,int end)
	{
		int pivot=a[start];
		int i=start+1;
		int j=end;
		while(i<=j)
		{
			while(a[i]<=pivot && i<=j)
				i++;
			while(a[j]>pivot &&i<=j)
				j--;
			if(i<j)
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		int temp=a[start];
		a[start]=a[j];
		a[j]=temp;
		return j;
	}
	public static void quicksort(int a[],int start,int end)
	{
		if(start<end)
		{
			int p=(partition(a,start,end));
			quicksort(a,start,p-1);
			quicksort(a,p+1,end);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
    	System.out.println("QuickSort");
        System.out.println("Enter number of elements");
        int n=sc.nextInt(),i;
        int a[]=new int[n];
        System.out.println("Enter "+n+" Values");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        quicksort(a,0,n-1);
        for(i=0;i<n;i++)
        	System.out.print(a[i]+" ");
	}
}
