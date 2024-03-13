package DataStructures;
import java.util.Scanner;

public class HeapSort {
	public static void heapify(int a[],int n,int i)
	{
		int big=i;
		int left=(i*2)+1;
		int right=(i*2)+2;
		if(left<n && a[left]>a[big])
			big=left;
		if(right<n && a[right]>a[big])
			big=right;
		if(big!=i)
		{
			int temp=a[big];
			a[big]=a[i];
			a[i]=temp;
			heapify(a,n,big);
		}
			
	}
	 public static void heapSort(int a[], int n)
	 {
		 for(int i=(n/2)-1;i>=0;i--){
			 heapify(a,n,i);
		}
		for(int i=n-1;i>=0;i--)
		{
			 int temp=a[0];
			 a[0]=a[i];
			 a[i]=temp;
			 heapify(a,i,0);
		 }
		 
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
    	System.out.println("HeapSort");
        System.out.println("Enter number of elements");
        int n=sc.nextInt(),i;
        int a[]=new int[n];
        System.out.println("Enter "+n+" Values");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        heapSort(a,n);
        for(i=0;i<n;i++)
        	System.out.print(a[i]+" ");
	}
}
