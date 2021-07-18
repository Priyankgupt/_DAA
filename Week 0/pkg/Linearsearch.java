/* Priyank Gupta B.Tech CSE(SE) SECtion SE 2015092
  Given an array of nonnegative integers, design a linear algorithm and implement it using a program to find whether given key element is present in the array or not.
  Also, find total number of comparisons for each input case.
  (Time Complexity = O(n), where n is the size of input) 
 */
package pkg;
import java.util.Scanner;
public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Array length:");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter Array Elements:");
      for(int i=0; i<n;i++)
      {
    	  arr[i] =  sc.nextInt();
      }
      System.out.println("Enter Key Elements to Search:");
      
      int key = sc.nextInt();
      int result = search(arr,key);
      if(result == 1)
      {
    	  System.out.println("Elemenys is not present in array:");
          
      }
      else
      {
    	  System.out.println("Elemenys is  present in array at:" +result);
    	 
      }
      sc.close();
	}
	public static int search(int arr[], int key)
	{
		int len=arr.length;
		
		for(int i=0; i<len; i++)
		{
			if(arr[i]==key)
			{ 
				
				return i;
          	
			}
			
		}
	
		return 1;
	}

}
