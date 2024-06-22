//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//NOT SOLVED


//User function Template for Java

class Solution{
    
   
    // Function for finding maximum and value pair
    public int lenOfLongSubarr (int nums[], int N, int k) {
        
        int ans = 0;  // Initialize ans to store the count of subarrays with sum equals to k

        int prefixsum = 0;  // Initialize prefixsum to store the cumulative sum of elements

        HashMap<Integer,Integer> memo = new HashMap<>();  // Initialize a HashMap for memoization
        memo.put(prefixsum, -1);  // Start with prefixsum 0, encountered once

        for (int i=0;i<N;i++) {  // Iterate through each element in the nums array
        prefixsum = prefixsum + nums[i];  // Update prefixsum with the current element's value

        // Check if there exists a prefix sum which when subtracted from current prefixsum equals k
        if (memo.containsKey(prefixsum - k)) {
        ans = Math.max(ans,i-memo.get(prefixsum - k));  // Add the count of such prefix sums to ans
        }
    
        // Update memo HashMap with current prefixsum
        if (!memo.containsKey(prefixsum)) {
            memo.put(prefixsum, i);  // Add prefixsum to memo with count 1 if it does not exist
    }
        }

        return ans;  // Return the total count of subarrays with sum equals to k

        
    }
}
    
    


