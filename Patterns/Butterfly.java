package Patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n = 4;
        int sp = 2*n-2;
        int st = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=st;j++){
                System.out.print("*");
            }
            for(int j =1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=st;j++){
                System.out.print("*");
            }
            st+=1;
            sp-=2;
            System.out.println();

        }
        int st1 = n;
        int sp1 = 0; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=st1;j++){
                System.out.print("*");
            }
            for(int j =1;j<=sp1;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=st1;j++){
                System.out.print("*");
            }
            st1-=1;
            sp1+=2;
            System.out.println();

        }
    }
}
