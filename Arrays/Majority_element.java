package Arrays;

public class Majority_element {
    class Solution {
        static int majorityElement(int arr[]) {
            int n = arr.length;
            int freq = 0;
            int ans = -1;
    
            // Step 1: Find a candidate for the majority element using Boyer-Moore Voting Algorithm
            for (int i = 0; i < n; i++) {
                if (freq == 0) {
                    ans = arr[i];
                }
                if (arr[i] == ans) {
                    freq++;
                } else {
                    freq--;
                }
            }
    
            // Step 2: Verify if the candidate is actually a majority element
            freq = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == ans) {
                    freq++;
                }
            }
            return (freq > n / 2) ? ans : -1;
        }
    
        public static void main(String[] args) {
            int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};  // Example array
            int result = majorityElement(arr);
            
            if (result != -1) {
                System.out.println("The majority element is: " + result);
            } else {
                System.out.println("No majority element found.");
            }
        }

        // Moore's algorithm
        // int freq = 0; int ans = 0;
        // for(int i = 0;i< nums.length;i++){
        //     if(freq == 0){
        //         ans = nums[i];
        //     }
        //     if(ans == nums[i]){
        //         freq++;
        //     }
        //     else{
        //         freq--;
        //     }
        // }
        // return ans;
    }
    
}
