import java.util.Scanner;
class selectionSort
{
	void sort(int arr[])
	{
		int n = arr.length;
		//one by one move boundary of unsorted sub array
	
		for(int i=0; i<n-1; i++)
		{
			//find minimum element in unsorted array
			int min_idx = i;
			for(int j = i+1; j<n; j++)
				if(arr[j]<arr[min_idx])
					min_idx = j;
					int temp=arr[min_idx];
					arr[min_idx]=arr[i];
					arr[i]=temp;
		}
	}
	
	void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n; ++i)
			System.out.println(arr[i]+" ");
			System.out.println();
	}
	
	public static void main(String args[])
	{
	selectionSort ob=new selectionSort();
	
	Scanner in=new Scanner(System.in);
	int c, n, arr[];
	System.out.println("Enter number of elements");
	n=in.nextInt();
	arr = new int[n];
	
	System.out.println("Enter those "+n+" elements");
	for(c=0; c<n; c++)
		arr[c]=in.nextInt();
		
			System.out.println("Array before sort:");
			for(int i=0; i<arr.length; i++)
			{
			System.out.println(arr[i]+" ");
			}
			System.out.println();
		ob.sort(arr);
		System.out.println("Sorted array:");
		ob.printArray(arr);
		}
}