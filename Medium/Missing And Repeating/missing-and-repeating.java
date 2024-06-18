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
        
//         Why Use count Array Instead of a Single Variable count?
// Multiple Elements to Track:

// In the problem where you need to find both a repeating and a missing element, you have two distinct values to identify (result[0] for repeating and result[1] for missing). Using a single variable count would not be sufficient because it can only track one value at a time.
// Efficient Tracking:

// Using an array count allows us to efficiently track occurrences of each element from 1 to n. Each index in the count array corresponds directly to an element in arr, making it straightforward to increment counts and later check those counts to determine which elements are repeated or missing.
// Direct Indexing for Identification:

// Once we have populated the count array with the occurrences of each element in arr, we can directly iterate through this array (from 1 to n) to find:
// The index where count[i] == 2 indicates the repeating element (result[0]).
// The index where count[i] == 0 indicates the missing element (result[1]).
// Clear and Structured Solution:

// Using an array count provides a structured and clear approach to solving the problem. It separates the counting logic from the identification logic, which makes the code easier to understand and maintain.
        
        //Brute force approach
        
        // int[] result = new int[2];
        
        // // Array to track occurrences of each element
        // int[] count = new int[n + 1];
        
        // // Count occurrences of each element in arr
        // for (int i = 0; i < n; i++) {
        //     count[arr[i]]++;
        // }
        
        // // Find repeating and missing elements
        // for (int i = 1; i <= n; i++) {
        //     if (count[i] == 2) {
        //         result[0] = i; // Repeating element
        //     }
        //     if (count[i] == 0) {
        //         result[1] = i; // Missing element
        //     }
        // }
        
        // return result;
        
        
        
        
        //2nd Aproach -- > better aproach
        // This approach runs in O(n) time complexity since it involves a single pass 
        // through the array arr to populate hash and another pass through hash
        // to find the repeating and missing elements.
        
        // int hash[] = new int[n+1];
        
        // for(int i=0;i<n;i++){
        //     hash[arr[i]]++;
        // }
        
        
        // int missing = -1;
        // int repeating =-1;
        
        // for(int i=1;i<=n;i++){
        //     if(hash[i]==2)//so checking here that ki i index agar teri count 2 h toh tu mera repeating element
        //     {
        //         repeating = i;
        //     }
        //     if(hash[i] == 0)//so checking here that ki i index agar teri count 0 h toh tu mera repeating element
        //     {
        //         missing = i;
        //     }
        // }
        
        // return new int[]{repeating,missing};
        
        
        //my first approach after seeing the question(ONLY 2 TEST CASES PASSED)
        
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
        
        
        
        
        
        
        //OPTIMIZED APPROACH ==> T(C) == O(N) & S(C) == O(1)
        
        long N = n;
        
        long sn = (N * (N + 1)) / 2; // Sum of first n natural numbers
        long s2n = (N * (N + 1) * (2 * N + 1)) / 6; // Sum of squares of first n natural numbers
        
        long sumofallelementsofarr = 0; 
        long s2 = 0;//s2 ==> sum of squares of all the elements in the array arr
        
        // Calculate sum and sum of squares of elements in arr
        for (int i = 0; i < n; i++) {
            sumofallelementsofarr = sumofallelementsofarr + arr[i];
            s2 += (long)arr[i] * (long)arr[i];
        }
        
        long val1 = sumofallelementsofarr - sn;//x-y // Difference in sum gives the difference between repeating and missing numbers
        long val2 = s2 - s2n; // Difference in sum of squares gives the sum of squares of repeating and missing numbers
        
         val2 = val2 / val1;//x+y
        
        // Calculate x (missing) and y (repeating)
        long x = (val1 + val2) / 2;
        long y = x - val1;
        
        return new int[]{(int)x, (int)y};

    }
}
