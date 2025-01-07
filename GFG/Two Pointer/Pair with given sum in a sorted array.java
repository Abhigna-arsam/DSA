//{ Driver Code Starts
// Initial Template for Java


// You are given an integer target and an array arr[]. You have to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.
// Note: pairs should have elements of distinct indexes. 

// Examples :

// Input: arr[] = [-1, 1, 5, 5, 7], target = 6
// Output: 3
// Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
// Input: arr[] = [1, 1, 1, 1], target = 2
// Output: 6
// Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
// Input: arr[] = [-1, 10, 10, 12, 15], target = 125
// Output: 0
// Explanation: There is no such pair which sums up to 4.
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int low = 0;
        int high = arr.length-1;
        int cnt = 0;
        while(low < high){
            int sum = arr[low] + arr[high];
            if(sum == target){
                
                int left=1,right=1;
                while(low+1<=high && arr[low] == arr[low+1]){
                    low++;left++;
                } 
                while(high - 1 >= low && arr[high] == arr[high-1]){
                    high--;right++;
                }
                if(arr[low] == arr[high]){
                    cnt+=(left*(left-1))/2;
                }
                else{
                    cnt+=(left*right);
                }
                
                high--;
                low++;
            }
            else if(sum < target){
                low++;
            }
            else{
                high--;
            }
        }
        return cnt;
    }
}


//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends
