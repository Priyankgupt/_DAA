/*Priyank Gupta B.Tech CSE(SE) Section SE 2015092
 	
*/
package pkg;

import java.util.Scanner;

public class exponentialsearch {

	
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
			 int result = Search(array,key);
			 if(result== -1)

		         {
				    System.out.println("Not Present");
				 }
			 else
			 {
				 System.out.println("Present:" +(result+1));
			 }
			 sc.close();

		
	}

		 private static int BinarySearch(int[] A, int left, int right, int x)
			    {
			        if (left > right)
			        {
			            return -1;
			        }
			        int mid = (left + right) / 2;
			        if (x == A[mid]) 
			        {
			            return mid;
			        }
			        else if (x < A[mid]) 
			        {
			            return BinarySearch(A, left, mid - 1, x);
			        }
			        else 
			        {
			            return BinarySearch(A, mid + 1, right, x);
			        }
			    }
			    public static int Search(int[] A, int x)
			    {
			        int bound = 1;
			        while (bound < A.length && A[bound] < x) 
			        {
			            bound *= 2;        
			        }
			        return BinarySearch(A, bound/2, Integer.min(bound, A.length), x);
			    }
			
		}


