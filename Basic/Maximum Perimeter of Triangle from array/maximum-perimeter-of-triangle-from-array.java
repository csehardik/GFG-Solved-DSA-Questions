//{ Driver Code Starts
//Initial Template for Java

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
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    
		    Complete obj = new Complete();
		    int res = obj.maxPerimeter(arr, sizeOfArray);
		    
		    System.out.println(res);
		}
	}
}


            

// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maxPerimeter (int arr[], int n) {
        Arrays.sort(arr);
        
        int perimeter = -1;
        
        for(int i=n-1;i>=2;i--){
            if(arr[i-1]+arr[i-2] > arr[i]){
                perimeter = arr[i] + arr[i-1] + arr[i-2];
                break;
            }
        }
        
        return perimeter;
    }
    
    
}


