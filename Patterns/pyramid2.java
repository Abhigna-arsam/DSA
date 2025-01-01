package Patterns;

public class pyramid2 {
    public static void main(String[] args) {
        int N = 5;
        int sp;
        int st = 1;
        for(int i = 1 ; i<=N ; i++){
            sp=N-i;
            for(int j = 1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=st;j++){
                System.out.print(j);
            }
            
                st+=2;
                sp--;
            
            System.out.println();
        }
    
    }
}
