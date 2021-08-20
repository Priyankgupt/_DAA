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
			 insertionsort(arr,n);
			
			}
			sc.close();
		}
	public static void insertionsort(int arr[] , int n)
	{
		
		int c=0 ,s=0 ;
		for (int i = 1; i < n; ++i)
		{
			int key = arr[i];
			int j = i - 1;
			s++;
			while (j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j = j - 1;
				c++;
			}
			arr[j + 1] = key;
			
		}
		 for(int i = 0; i<n; i++)
		    {
		    	System.out.println(arr[i] + " ");
		    }
		    System.out.println("\ncomparisons" +c);
		    System.out.println("\nShifts" +s);
		    System.out.println();
	}
	 
	

}


