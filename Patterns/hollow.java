package Patterns;

public class hollow {
    public static void main(String[] args) {
        int N = 5;
        for(int i = 1;i<=N;i++){
            for(int j = 1; j<=N ;j++){
                if(i==1 || j==1 || (i+j == N+1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
