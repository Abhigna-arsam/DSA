package Arrays;

public class Sec_Lar {
    
    public static int getSecondLargest(int[] arr) {
            // Code Here
            if(arr.length<2){
                return -1;
            }
            int fMax = Integer.MIN_VALUE;
            int sMax = Integer.MIN_VALUE;
            for(int i : arr){
                if(i > fMax){
                    sMax = fMax;
                    fMax = i;
                }
                else if(i>sMax && i<fMax){
                    sMax = i;
                }
            }
            
            return (sMax == Integer.MIN_VALUE) ? -1 : sMax;
            
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int secondLargest =getSecondLargest(arr);
            System.out.println("Second largest element is: " + secondLargest);

    }


}
