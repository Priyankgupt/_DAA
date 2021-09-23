/* Priyank Gupta B.tech CSE (SE) 2015092
Question: Given an unsorted array of integers, design an algorithm and a program to sort the array using insertion sort. Your program should be able to find number of comparisons and shifts (shifts total number of times the array elements are shifted from their place) required for sorting the array.
	Input Format:
		The first line contains number of test cases, T. For each test case, there will be two input lines.
		First line contains n (the size of array).
		Second line contains space-separated integers describing array.
	Output Format:
		The output will have T number of lines.
		For each test case T, there will be three output lines.
		First line will give the sorted array.
		Second line will give total number of comparisons.
		Third line will give total number of shift operations required.
Sample Input: 
1
8
-23 65 -31 76 46 89 45 32
Sample Output: 
-31 -23 32 45 46 65 76 89
comparisons = 13
shifts = 20
*/
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


