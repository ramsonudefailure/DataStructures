package DataStructures;
import java.util.Scanner;
public class LinearSearch {
	public static int linearSearch(int a[],int n,int key)
	{
		int i;
		for(i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                return i;
            }
        }
		return i;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Linear Search");
        System.out.println("Enter number of elements");
        int n=sc.nextInt(),i;
        int a[]=new int[n];
        System.out.println("Enter "+n+" Values");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter value to search");
        int key=sc.nextInt();
    	if(linearSearch(a,n,key)==n)
    		System.out.println("Element "+key+" Not Found");
    	else
    		System.out.println("Element "+key+" Found at index"+linearSearch(a,n,key));
    }
}
