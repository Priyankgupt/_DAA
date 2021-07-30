/* Priyank Gupta B.Tech CSE(SE) SECtion SE 2015092 
 * Given an already sorted array of positive integers, design an algorithm and implement it using a
program to find whether a given key element is present in the sorted array or not. For an array
array[n], search at the indexes array[0], array[2], array[4],.....,array[2k
] and so on. Once the interval (array[2k
]
< key < array[ 2k+1] ) is found, perform a linear search operation from the index 2k
to find the element
key. (Complexity < O(n), where n is the number of elements need to be scanned for searching):*/
package pkg;
import java.util.Scanner;

public class jumpsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Array length:");
		 int n = sc.nextInt();
		 int array[] = new int[n];
		 System.out.println("Enter Elements Of Array:");
		 for(int i=0 ; i<n ; i++)
		 {
			 array[i] = sc.nextInt();
		 }
		 System.out.println("Enter Key Element to search:");
		 int key = sc.nextInt();
		 int result = jumpsearch(array,key);
		 if(result== 1)

	         {
			    System.out.println("Not Present");
			 }
		 else
		 {
			 System.out.println("Present:" +(result+1));
		 }
		 sc.close();

	}
	
	public static int jumpsearch(int array[] , int key)
	{
		 int n = array.length;
		 int step = (int)Math.floor(Math.sqrt(n));
		 int prev = 0;
	     while (array[Math.min(step, n)-1] < key)
	        {
	            prev = step;
	            step += (int)Math.floor(Math.sqrt(n));
	            if (prev >= n)
	                return 1;
	        }
	    
	        while (array[prev] < key)
	        {
	            prev++;
	            if (prev == Math.min(step, n))
	                return 1;
	        }
	 
	         if (array[prev] == key)
	            return prev;
	 
	        return 1;
	}

}
