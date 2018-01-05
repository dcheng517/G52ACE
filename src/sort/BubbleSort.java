package sort;

/**
 * sorts by swapping places with neighbour if is smaller
 * 
 * @author ch3ng
 *
 */

public class BubbleSort {
	
	static void bs(int[] arr)
	{
		int n = arr.length;
		int temp = 0;
		
		for(int i=0; i<n; i++) // goes through list few times
		{
			for(int j =1; j<n-i; j++) // goes pair by 
			{
				if(arr[j-1] > arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int arr[] = {3,60,35,2,45,320,5}; 
		
		System.out.println("Array before Bubble Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		bs(arr);
		
		System.out.println("\nArray after Bubble Sort: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}
