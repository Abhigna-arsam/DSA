package Patterns;

public class Pattern_3 {
    public static void main(String[] args) {
        int N = 5;
        int sp= N/2;
        int st = 1;
        for(int i = 1 ; i<=N ; i++){
            for(int j = 1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=st;j++){
                System.out.print("*");
            }
            st+=2;
            System.out.println();
        }
    }
}
