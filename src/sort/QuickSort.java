package sort;

public class QuickSort {
	
	private int array[];
	private int length;
	
	public void sort(int[] arr)
	{
		if((arr == null) || (arr.length==0))
		{
			return;
		}
		
		this.array = arr;
		length = arr.length;
		qs(0, (length-1));
		
	}
	
	private void swap(int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	private void qs(int low, int high)
	{
		int i = low;
		int j = high;
		
		// use median as pivot
		int pivot = array[low+(high-low)/2];
		
		// Divide into 2 arrays
		while(i <= j)
		{
			while(array[i] < pivot)
			{
				i++;
			}
			
			while(array[j] > pivot)
			{
				j--;
			}
			
			if(i <= j)
			{
				swap(i, j);
				i++;
				j--;
			}
		}
		
		if(low < j)
		{
			qs(low, j);
		}
		if(i < high)
		{
			qs(i, high);
		}
	}
	
	public static void main(String[] args)
	{
		QuickSort sorter = new QuickSort();
		
		int arr[] = {3,60,35,2,45,320,5}; 
		
		System.out.println("Array before Quick Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		sorter.sort(arr);
		
		System.out.println("\nArray after Quick Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
}
