package Patterns;
public class Spiral1 {
    public static void main(String[] args) {
       
        int n = 4;
        int st = n;
        for(int i = 1;i<=n ; i++){
            for(int j = 1;j<=st;j++){
                //System.out.print("*");
                int min = i<j ? i:j;
                System.out.print(n - min +1);
                
            }
            for(int j = st-1;j>=1;j--){
                //System.out.print("*");
                int min = i<j ? i:j;
                System.out.print(n - min +1);
                
            }
            
            System.out.println();
        }
        for(int i = n-1;i>=1 ; i--){
            for(int j = 1;j<=st;j++){
                //System.out.print("*");
                int min = i<j ? i:j;
                System.out.print(n - min +1);
                
            }
            for(int j = st-1;j>=1;j--){
                //System.out.print("*");
                int min = i<j ? i:j;
                System.out.print(n - min +1);
                
            }
            
            System.out.println();
        }
    }
}
