package pkg;
import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of test cases: ");
			int t = sc.nextInt();
			while(t-- > 0)
			{
			System.out.println("Enter array length: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter array elements: ");
			for(int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			insertionsort ob = new insertionsort();
			ob.sort(arr);
			printArray(arr);
			}
			sc.close();
		}
	void sort(int arr[])
	{
		
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	 public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
	

}


