package DataStructures;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	public static int binarySearch(int a[],int n,int key)
	{
		int start=0,end=n-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(a[mid]==key)
				return mid;
			else if(a[mid]<key)
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Binary Search");
        System.out.println("Enter number of elements");
        int n=sc.nextInt(),i;
        int a[]=new int[n];
        System.out.println("Enter "+n+" Values");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.println("Enter value to search");
        int key=sc.nextInt();
        if(binarySearch(a,n,key)==-1)
    		System.out.println("Element "+key+" Not Found");
    	else
    		System.out.println("Element "+key+" Found at index "+binarySearch(a,n,key));
	}
}
