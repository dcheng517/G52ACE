package sort;

/**
 * sets arr[0] as sorted, loops arr[i], i=1; i++ and check with each
 * element before arr[i] and sorts till arr[i]
 * @author ch3ng
 *
 */

public class InsertionSort {
	
	public void is(int[] arr)
	{
		int n = arr.length;
		
		for(int i=1; i<n; i++)
		{
			int hold = arr[i];
			int j = i;
			
			while((j>0) && (arr[j-1]>hold))
			{
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = hold;
		}

	}
	
	public static void main(String[] args)
	{
		InsertionSort sorter = new InsertionSort();
		
		int arr[] = {3,60,35,2,45,320,5}; 
		
		System.out.println("Array before Insertion Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		sorter.is(arr);
		
		System.out.println("\nArray after Insertion Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
}
