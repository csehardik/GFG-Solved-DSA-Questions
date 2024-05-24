//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int n) {
        // code here

//      int revnum=0;
  
        int sum=0;
  
        while(n>0){
            int ld = n%10;
            sum = sum+ld;
            n=n/10;
  
//revnum = (revnum*10)+ld;
        }
        
        if(sum < 10 || sum%11 == 0){
            return 1;
        }
        return 0;
    }
}