//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            long ans = new Solution().countNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int countNumbers(int n) {
        
        Set<Integer> set = Set.of(1,2,3,4,5);
        int count = 0;
        
        for(int i=1;i<=n;i++){
            if(checkCompromise(i,set)) count++;
        }
        return count;
    }
    
    static boolean checkCompromise(int num,Set s){
        while(num>0){
            int n = num%10;
            if(!s.contains(n)) return false;
            num = num/10;
        }
        return true;
    }
}
