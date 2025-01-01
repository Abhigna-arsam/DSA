package Patterns;

public class Pattern_2 {
    public static void main(String[] args) {
        int n=5;
        int st=n;
        int sp =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}
