/*Priyank Gupta  B.Tech CSE(SE) Section SE 2015092
Given a sorted array of positive integers containing few duplicate elements, design an algorithm
and implement it using a program to find whether the given key element is present in the array
or not. If present, then also find the number of copies of given key. (Time Complexity = O(log n))
*/
package pkg ;
 
import java.util.Scanner;

public class prob1 {

	public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Enter elements of array: ");
		for(int i = 0; i < n; i++)
		{
			A[i] = sc.nextInt();
		}
		System.out.println("Enter element to search: ");
		int key = sc.nextInt();
        int first = BinarySearch(A, key, true);
        int last = BinarySearch(A, key, false);
        int c = last - first + 1;
        if (first != -1) 
        {
            System.out.println(key + " Present " + c + " times");
        }
        else 
        {
            System.out.println("Not Present");
        }
        sc.close();
    }


public static int BinarySearch(int[] A, int x, boolean searchFirst)
{
    int left = 0;
    int right = A.length - 1;
    int result = -1;
    while (left <= right)
    {
        int mid = (left + right) / 2;
        if (x == A[mid])
        {
            result = mid;
            if (searchFirst)
            {
                right = mid - 1;
            }
            else 
            {
                left = mid + 1;
            }
        }
        else if (x < A[mid]) 
        {
            right = mid - 1;
        }
        else 
        {
            left = mid + 1;
        }
    }
    return result;
}
}
