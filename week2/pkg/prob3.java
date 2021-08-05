/*Priyank Gupta  B.Tech CSE(SE) Section SE 2015092
 * Given an array of nonnegative integers, design an algorithm and a program to count the number
of pairs of integers such that their difference is equal to a given key, K.
 */
package pkg;
import java.util.Scanner;
public class prob3 {

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter number of test cases: ");
		    int t = sc.nextInt();
		    while(t-- > 0)
			{
		    	System.out.println("Enter array length: ");
		    	int n = sc.nextInt();
		    	int array[] = new int[n];
		    	System.out.println("Enter array elements: ");
		    	for(int i = 0; i < n; i++)
		    	{
		    		array[i] = sc.nextInt();
		    	}
		    	System.out.println("Enter key: ");
		    	int key = sc.nextInt();
		    	System.out.println("Number of pairs with difference " + key + " are: " + count(array,n,key));
		    }
		    sc.close();
		}
		static int count(int array[], int n, int key)
		{
			int c = 0;
			for(int i = 0; i < n; i++)
			{
				for (int j = i + 1; j < n; j++)
	                if (array[i] - array[j] == key || array[j] - array[i] == key)
	                    c++;
	        }
	        return c;
		}
	}
