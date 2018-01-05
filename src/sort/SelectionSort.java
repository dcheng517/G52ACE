package sort;

/**
 * sorts elements by swapping places with the smallest
 * element remaining
 * 
 */
public class SelectionSort {

	static void ss(int[] arr)
	{
		int n = arr.length;
		
		for(int i=0; i<n-1; i++)
		{
			int min = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j; // smallest element
				}
			}
			
			if(i != min )
			{
				int small = arr[min];
				arr[min] = arr[i];
				arr[i] = small;
			}	
		}
	}
	
	public static void main(String[] args)
	{
		int arr[] = {3,60,35,2,45,320,5}; 
		
		System.out.println("Array before Selection Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		ss(arr);
		
		System.out.println("\nArray after Selection Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
}
