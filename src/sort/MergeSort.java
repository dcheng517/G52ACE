package sort;

public class MergeSort {

	private int[] array;
	private int[] temp;
	private int length;
	
	public void sort(int arr[])
	{
		this.array = arr;
		this.length = arr.length;
		this.temp = new int[length];
		doMergeSort(0, (length-1));
	}
	
	private void doMergeSort(int low, int high)
	{
		if(low < high)
		{
			int mid = low + (high - low)/2;
			
			doMergeSort(low, mid);
			
			doMergeSort(mid+1, high);
			
			mergeParts(low, mid, high);
		}
	}
	
	private void mergeParts(int low, int mid, int high)
	{
		for(int i=low; i<=high; i++)
		{
			temp[i] = array[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		
		while((i<=mid) && (j<=high))
		{
			if(temp[i] <= temp[j]) {
				array[k] = temp[i];
				i++;
			}else
			{
				array[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while(i <= mid)
		{
			array[k] = temp[i];
			k++;
			i++;
		}
	}
	
	public static void main(String[] args)
	{
		MergeSort sorter = new MergeSort();
		
		int arr[] = {3,60,35,2,45,320,5}; 
		
		System.out.println("Array before Merge Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		sorter.sort(arr);
		
		System.out.println("\nArray after Merge Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
}





