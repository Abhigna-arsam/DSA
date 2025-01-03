public class Basics {
    public static void PrintDec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
    public static void PrintInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
        
    }
    public static int Fib(int n){
        if(n==0|| n==1){
            return n;
        }
        return Fib(n-1)+Fib(n-2);
    }
    public static boolean IsSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return IsSorted(arr,i+1);
    }

    public static int FirstOccurance(int[] arr, int i, int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key)
            return i;
        return FirstOccurance(arr,i+1,key);

    }
    public static int LastOccurance(int[] arr, int i, int key){
        if(i==-1){
            return -1;
        }
        if(arr[i] == key)
            return i;
        return LastOccurance(arr,i-1,key);

        

    }
    public static int lastOccur(int[] arr, int i, int key){
        
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccur(arr,i+1,key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static int optPower(int x, int n){
        if(n==0)
            return 1;
        int power = optPower(x,n/2);
        int ans = power * power;
        if(n%2!=0){
            ans *= x;
        }
        return ans;

    }
    public static void main(String[] args) {
        PrintDec(10);
        System.out.println();
        PrintInc(10);
        System.out.println();
        System.out.println(Fib(10));
        int[] arr = {1,2,3,4,5};
        int i =0;
        int[] arr1 = {1,2,3,4,2,5,7};

        System.out.println("is array sorted? "+ IsSorted(arr,i));
        System.out.println(FirstOccurance(arr,i,2));
        System.out.println(LastOccurance(arr1,arr1.length-1,2));
        System.out.println(lastOccur(arr1,0,2));
        System.out.println("Power = "+optPower(2,5)); 


    }
}
