//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading testcases count
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)       {
            
            String st[] = read.readLine().trim().split(" ");
            
            //reading size of array 
            int N =Integer.parseInt(st[0]);
            
            //creating a new array of size n
            int A[] = new int[N];
            st = read.readLine().trim().split(" ");
            
            //adding elements to the array
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(st[i]);
                
            //calling the method binSort() of
            //class BinarySort()
            new Solution().binSort(A, N);
            
            //printing the elements of array
            for(Integer x: A)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to sort the bin
    static void binSort(int arr[], int N)
    {
    
        // Arrays.sort(A);
        
        int left = 0;
        int right = N-1;
        
        while(left<=right){
            if(arr[left] == 0){
                left++;
            }
            else if(arr[right] == 1){
                right--;
            }
            else{
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }
        
        /**************
        * No need to print the array
        * ************/
    }
}

