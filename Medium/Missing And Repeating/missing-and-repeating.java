//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// In order to Finding the Repeated Element:
//      Use a HashSet to track elements as you iterate through the array.
//      The repeated element is found when an element is already present in the HashSet.

// In order to  Finding the Missing Element:
//      Calculate the sum of the first n natural numbers.
//      Calculate the actual sum of the array elements.
//      The missing number can be found using the formula missing = sum(1 to n) - (sum of array - repeated number).


// Key Points:
// Efficiency: This approach works in O(n) time complexity and O(n) space complexity due to the HashSet.


class Solve {
    int[] findTwoElement(int arr[], int n) {
        
        int[] result = new int[2];
        
        // Array to track occurrences of each element
        int[] count = new int[n + 1];
        
        // Count occurrences of each element in arr
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        
        // Find repeating and missing elements
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i; // Repeating element
            }
            if (count[i] == 0) {
                result[1] = i; // Missing element
            }
        }
        
        return result;
        
        //BRUTE FORCE APPROACH(ONLY 2 TEST CASES PASSED)
        
    //       int[] result = new int[2];
    //     int x=1;
    //   //repeated number
    //   Arrays.sort(arr);
    //   for(int i=0;i<n-1;i++)
    //   { 
    //       if(arr[i]==arr[i+1])
    //         {
    //               result[0]=arr[i];
    //               break;
    //         }  
    //   }
       
    //   // missing number
    //   for(int i=0;i<n;i++)
    //   {
    //       if(x!=arr[i])
    //       {
    //           result[1]=x; 
    //           break;
    //       }
    //       x++;
    //   }
    //   return result;
        
        
        
        
        
        
        //OPTIMIZED APPROACH(10 TEST CASES STILL LEFT TO PASS)
        
        // int[] result = new int[2];
        
        
        // // Step 1: Find the repeated element
        
        // Set<Integer> set = new HashSet<>();
        // int repeat = -1;
        
        // for (int num : arr) {
        //     if (!set.add(num)) {
        //         repeat = num;
        //         break;
        //     }
        // }
        
        // // Step 2: Find the missing element
        // int shouldSum = n * (n + 1) / 2; // Sum of first n natural numbers
        // int actualSum = 0;
        // for (int num : arr) {
        //     actualSum += num;
        // }
        // int missing = shouldSum - (actualSum - repeat);
        
        // result[0] = repeat;
        // result[1] = missing;
        
        // return result;
    }
}