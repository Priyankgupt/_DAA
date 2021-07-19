package pkg;
import java.util.Scanner;
public class binarysearch {
	
 public static void main(String[]args)
 {
 
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
	 int result = binarysearch(array,key);
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

 public static int binarysearch(int array[], int key)
 {
	 int i;
	 if(array == null || array.length<0)
	 {
		 System.out.println("Not Present");
	 }
	int  last = array.length-1;
	 for(i=0; i<= last ;)
	 {
		 int  mid = i+ (last-i)/2;
		 if(key == array[mid])
		 {
			 return mid;
		 }
		 else if( key>array[mid])
		 {
			 i++;
		 }
		 else
		 {
			 last--;
		 }
	 }
	return last;
	 
  }
}
