/*
Priyank gupta B.tech CSE(SE) 2015092  3rd year
Given a sorted array of positive integers, design an algorithm and implement it using a program
to find three indices i, j, k such that arr[i] + arr[j] = arr[k].
Input format:
The first line contains number of test cases, T.
For each test case, there will be two input lines.
First line contains n (the size of array).
Second line contains space-separated integers describing array.
Output:
The output will have T number of lines.
For each test case T, print the value of i, j and k, if found else print “No sequence found”.
sample input 
1 
5 
1 5 84 209 341

smaple output
no sequence found
*/
import java.util.Scanner;
import java.util.*;
class problem2{

public static void findSequence(int arr[],int l,int r,int n){
    int flag=0;
    for(int k=1;k<=n;k++)
    {
        l=1;
        r=n;
        while(l<r){
            int sum=arr[l]+arr[r];
            if (sum==arr[k]){
                System.out.println(l+", "+", "+k);
                return;
            }
            else if (sum<arr[k]) 
                l++;
            else r--;
        }
    }
    System.out.println("Sequence not found");
}

public static void main(String[] args){
    int n,i,t;
    Scanner sc=new Scanner(System.in);
    t=sc.nextInt(); //Total number of test cases
    while(t!=0){
        n=sc.nextInt(); //Size of array
        int arr[]=new int[n];
        //Elements of array
        for(i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        findSequence(arr,1,n,n);
        t=t-1;
    }
}
