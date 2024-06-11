//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java





class Solution {
    ArrayList<Long> alternateSort(long arr[], int N) {
        ArrayList<Long> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(arr);

        // Initialize two pointers, one from the start and one from the end
        int left = 0, right = N - 1;

        // Alternate sorting logic
        while (left <= right) {
            // Add the element from the right pointer
            ans.add(arr[right--]);
            // Add the element from the left pointer
            if (left <= right)
                ans.add(arr[left++]);
        }

        return ans;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] a2 = line.trim().split("\\s+");
//            int n =Integer.parseInt(a2[0]);
//            int k =Integer.parseInt(a2[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            Solution ob = new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            ArrayList<Long> ans = ob.alternateSort(a, n);
            for (int i = 0; i < n; i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
    }
}




// } Driver Code Ends