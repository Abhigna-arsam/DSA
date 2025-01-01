package Patterns;

public class hollow_rhombus {
    public static void main(String[] args) {
        int n = 5;
        int sp = n-1;
        for(int i = 1;i<=n ; i++){
            for(int j = 1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                if(i==1 || i== n || j==1 || j==n)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            sp--;
            System.out.println();
        }
    }
}
