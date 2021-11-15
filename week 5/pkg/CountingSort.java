/*
Priyank Gupta B.Tech CSE(SE) 2015092 3rd year
Given an unsorted array of alphabets containing duplicate elements. Design an algorithm and
implement it using a program to find which alphabet has maximum number of occurrences and print
it. (Time Complexity = O(n)) (Hint: Use counting sort)
Input Format: The first line contains number of test cases, T. For each test case, there will be two input
lines. First line contains n (the size of array). Second line contains space-separated integers describing
array.
Output: The output will have T number of lines. For each test case, output will be the array element
which has maximum occurrences and its total number of occurrences. If no duplicates are present
(i.e. all the elements occur only once), output should be “No Duplicates Present”.

sample input
3
10
a e d w a d q a f p
 sample output
 no dulpicates elements
 */
import java.util.*;
public class countingsort 
{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n,i,t;
        t=sc.nextInt(); //Total number of test cases
        while(t!=0){
            n=sc.nextInt();//Size of array
            char arr[]=new char[n];
            //Elements of array
            for(i=0;i<n;i++)
            {
                arr[i]=sc.next().charAt(0);
            }
            int freq[]=new int[26];
            for(i=0;i<n;i++)
            {
                freq[arr[i]-'a']++;
            }
            int max=0,in=0;
            for(i=0;i<26;i++)
            {
                if(freq[i]>max)
                {
                    max=freq[i];
                    in=i;
                }
            }
            if(max>1)
            System.out.println((char)('a'+in)+" : "+max);
            else
            System.out.println("No Duplicates Present");
            t=t-1;
    }
}
            
}
