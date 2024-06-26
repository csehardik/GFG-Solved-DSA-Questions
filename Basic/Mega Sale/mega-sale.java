//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            
            String[] xy = br.readLine().trim().split(" ");
            int n = Integer.parseInt(xy[0]);
            int m = Integer.parseInt(xy[1]);
            
            
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            
            Compute g = new Compute();
            System.out.println(g.maxProfit(a, n, m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Compute {

    public static long maxProfit(int a[], int n, int m) {
        // Your code goes here 
        Arrays.sort(a);
        long sum = 0;
        int p = 0;
        
        for(int i=0;i<n;i++){
            if(a[i] < 0 && p<m){
                sum = sum+Math.abs(a[i]);
                p++;
            }
        }
        return sum;
    }
}